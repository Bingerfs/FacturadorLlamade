package Proyecte;

import Proyecte.callRecord.CallRecordBoundaryIn;
import Proyecte.callRecord.CallRecordBoundaryOut;
import Proyecte.callRecord.CallRecordDto;
import Proyecte.callRecord.CallRecordMapper;
import Proyecte.client.ClientBoundaryIn;
import spark.Request;
import spark.Response;
import spark.Route;
import spark.utils.IOUtils;

import javax.servlet.MultipartConfigElement;
import javax.servlet.http.Part;

import static Proyecte.RequestUtil.*;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CallRecordController {
    private CallRecordBoundaryIn callRecordBoundaryIn;
    private CallRecordBoundaryOut callRecordBoundaryOut;
    CallRecordController(CallRecordBoundaryIn callRecordBoundaryIn, CallRecordBoundaryOut callRecordBoundaryOut){
        this.callRecordBoundaryIn = callRecordBoundaryIn;
        this.callRecordBoundaryOut = callRecordBoundaryOut;
    }

    public Route getAllCallRecords = (Request request, Response response) -> {
        List<CallRecordDto> callRecords = callRecordBoundaryIn.getAllCallRecords();
        HashMap<String, Object> model =callRecordBoundaryOut.onShowAllCallRecords(callRecords);
        return ViewUtil.render(request, model, Path.Template.CALLRECORDS_ALL);
    };
    public  Route getfileCallrecords = (Request request, Response response) -> {
        //Map<String, Object> model = new HashMap<>();
        String filepath=getfileurl(request);
        CRReader.filename=filepath;
        HashMap<String, Object> model = new HashMap<>();
        model.put("callRecords", CRReader.readfilecdr());
        return ViewUtil.render(request, model, Path.Template.CALLRECORDS_ALL);
        //return ViewUtil.render(request, callRecordBoundaryIn.getAllCallRecords(), Path.Template.CALLRECORDS_ALL);

       // return ViewUtil.render(request, model, Path.Template.INDEX);
    };

    public Route rateUploadedRecords = (Request request, Response response) -> {
        CRReader.rateAllRecords();
        HashMap<String, Object> model = new HashMap<>();
        model.put("callRecords", CRReader.callRecords);
        return ViewUtil.render(request, model, Path.Template.RCALLRECORDS);
    };

    public Route saveCdrList = (Request request, Response response) -> {
        CallRecordMapper mapper = new CallRecordMapper();
        for(CallRecord callRecord : CRReader.callRecords)
            callRecordBoundaryIn.createCallRecord(mapper.transClient(callRecord));
        return getAllCallRecords;
    };
}

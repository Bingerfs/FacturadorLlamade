package Proyecte;

import Proyecte.callRecord.CallRecordBoundaryIn;
import Proyecte.client.ClientBoundaryIn;
import spark.Request;
import spark.Response;
import spark.Route;

public class CallRecordController {
    private CallRecordBoundaryIn callRecordBoundaryIn;

    CallRecordController(CallRecordBoundaryIn callRecordBoundaryIn){
        this.callRecordBoundaryIn = callRecordBoundaryIn;
    }

    public Route getAllCallRecords = (Request request, Response response) -> {
        return ViewUtil.render(request, callRecordBoundaryIn.getAllCallRecords(), Path.Template.CALLRECORDS_ALL);
    };
}

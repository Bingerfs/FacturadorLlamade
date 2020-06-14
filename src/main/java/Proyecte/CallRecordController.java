package Proyecte;

import Proyecte.callRecord.CallRecordBoundaryIn;
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
import java.util.Map;

public class CallRecordController {
    private CallRecordBoundaryIn callRecordBoundaryIn;
    CallRecordController(CallRecordBoundaryIn callRecordBoundaryIn){
        this.callRecordBoundaryIn = callRecordBoundaryIn;
    }

    public Route getAllCallRecords = (Request request, Response response) -> {
        return ViewUtil.render(request, callRecordBoundaryIn.getAllCallRecords(), Path.Template.CALLRECORDS_ALL);
    };
    public  Route getfileCallrecords = (Request request, Response response) -> {
        //request.attribute("org.eclipse.jetty.multipartConfig", new MultipartConfigElement("D:/tmp"));
        //String file=request.queryParams("file");

        Map<String, Object> model = new HashMap<>();
        String filepath=getfileurl(request);
        System.out.println("fle is "+filepath);

        /*model.put("authenticationSucceeded", true);
        request.session().attribute("currentUser", getQueryUsername(request));
        if (getQueryLoginRedirect(request) != null) {
            response.redirect(getQueryLoginRedirect(request));
        }*/
        return ViewUtil.render(request, model, Path.Template.INDEX);
    };
}

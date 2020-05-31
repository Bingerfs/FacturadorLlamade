package Proyecte;
import spark.*;
import java.util.*;
import static Proyecte.JsonUtil.*;
import static Proyecte.RequestUtil.*;
public class UIController {
    static ICDRRepository icdrRepository;
    static List<Client> clientList;


    public static Route index=(Request request, Response response)->{
        HashMap<String, Object> model = new HashMap<>();
        model.put("callrecordslist",clientList);
        return ViewUtil.render(request,model,Path.Template.INDEX);
    };
    public static Route fetchAllBooks = (Request request, Response response) -> {
        if (clientAcceptsHtml(request)) {
            HashMap<String, Object> model = new HashMap<>();
            model.put("callrecords", icdrRepository.getAllCallRecords());
            return ViewUtil.render(request, model, Path.Template.CALLRECORDS_ALL);
        }
        if (clientAcceptsJson(request)) {
            return dataToJson(icdrRepository.getAllCallRecords());
        }
        return ViewUtil.notAcceptable.handle(request, response);
    };


}

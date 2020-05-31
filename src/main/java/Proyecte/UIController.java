package Proyecte;
import spark.*;
import java.util.*;
import static Proyecte.JsonUtil.*;
import static Proyecte.RequestUtil.*;
public class UIController {
     ICDRRepository icdrRepository;
     List<Client> clientList;
     ViewUtil viewUtil;
    Path path;

    public  Route index=(Request request, Response response)->{
        HashMap<String, Object> model = new HashMap<>();
        model.put("callrecordslist",this.clientList);
        return ViewUtil.render(request,model,Path.Template.INDEX);
    };
    /*public  Route fetchAllBooks = (Request request, Response response) -> {
            HashMap<String, Object> model = new HashMap<>();
            model.put("callrecords", icdrRepository.getAllCallRecords());
            return ViewUtil.render(request, model, Path.Template.CALLRECORDS_ALL);



    };*/


}

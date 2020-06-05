package Proyecte;
import Proyecte.client.Client;
import spark.*;
import java.util.*;

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

}

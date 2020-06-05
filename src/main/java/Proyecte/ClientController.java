package Proyecte;

import Proyecte.Path;
import Proyecte.ViewUtil;
import Proyecte.client.ClientBoundaryIn;
import spark.*;

public class ClientController {
    private ClientBoundaryIn clientBoundaryIn;

    ClientController(ClientBoundaryIn clientBoundaryIn){
        this.clientBoundaryIn = clientBoundaryIn;
    }

    public Route getAllClients = (Request request, Response response) -> {
        return ViewUtil.render(request, clientBoundaryIn.getAllClients(), Path.Template.CLIENTS);
    };
}
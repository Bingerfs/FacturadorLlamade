package Proyecte.client;

import Proyecte.client.Client;
import Proyecte.client.ClientBoundaryOut;

import java.util.HashMap;
import java.util.List;

public class ClientPresenter implements ClientBoundaryOut {

    @Override
    public HashMap<String, Object> showAllClients(List<Client> clients) {
        HashMap<String, Object> model = new HashMap<>();
        model.put("clients", clients);
        return model;
    }
    
}
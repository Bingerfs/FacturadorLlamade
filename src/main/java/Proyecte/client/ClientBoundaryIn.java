package Proyecte.client;

import Proyecte.client.Client;
import Proyecte.client.ClientDto;

import java.util.HashMap;

public interface ClientBoundaryIn {
    HashMap<String, Object> getAllClients();
    void createClient(ClientDto client);
    Client findClientByCi(String ci);
}
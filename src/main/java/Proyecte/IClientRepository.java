package Proyecte;

import Proyecte.client.Client;
import Proyecte.client.ClientDto;

import java.util.List;

public interface IClientRepository {
    List<Client> getAllClients();
    void createClient(ClientDto client);
    Client getClientByCi(String ci);
    
}
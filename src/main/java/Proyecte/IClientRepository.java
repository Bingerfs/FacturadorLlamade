package Proyecte;

import java.util.List;

public interface IClientRepository {
    List<Client> getAllClients();
    void createClient(ClientDto client);
    Client getClientByCi(String ci);
    
}
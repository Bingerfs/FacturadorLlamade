package Proyecte;

import java.util.List;

public interface ClientRepository {
    List<Client> getAllClients();
    void createClient(ClientDto client);
    
}
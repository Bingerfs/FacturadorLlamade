package Proyecte;

import java.util.HashMap;
import java.util.List;

public class ClientService implements ClientBoundaryIn {
    private IClientRepository clientRepository;
    private ClientBoundaryOut clientBoundaryOut;

    ClientService(IClientRepository clientRepository, ClientBoundaryOut clientBoundaryOut){
        this.clientRepository = clientRepository;
        this.clientBoundaryOut = clientBoundaryOut;
    }

    @Override
    public void createClient(ClientDto client) {
        clientRepository.createClient(client);
    }

    @Override
    public HashMap<String, Object> getAllClients() {
        List<Client> clients =clientRepository.getAllClients();
        return clientBoundaryOut.showAllClients(clients);
    }

    @Override
    public Client findClientByCi(String ci){
        return clientRepository.getClientByCi(ci);
    }
    
    
}
package Proyecte.client;

import Proyecte.client.Client;
import Proyecte.client.ClientDto;

public class ClientMapper {
    public Client transformClient(ClientDto data){
        return new Client(data.name, data.ci, data.address);
    }

    public ClientDto transClient(Client client){
        return new ClientDto(client.name, client.address, client.ci);
    }


}
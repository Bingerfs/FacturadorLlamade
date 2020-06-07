package Proyecte.client;

public class ClientMapper {
    public Client transformClient(ClientDto data){
        return new Client(data.name, data.ci, data.address);
    }

    public ClientDto transClient(Client client){
        return new ClientDto(client.name, client.address, client.ci);
    }


}
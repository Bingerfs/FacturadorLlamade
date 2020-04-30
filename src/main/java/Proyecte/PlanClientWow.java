package Proyecte;

import java.util.ArrayList;
import java.util.List;

public class PlanClientWow implements IPlanClient{
    Client client;
    String phoneNumber;
    String balance;
    String receivables;
    List<String> friends;
    
public PlanClientWow(Client client, String phoneNumber, List<String> friends) {
    this.client = client;
    this.phoneNumber = phoneNumber;
    this.friends = friends;
}

@Override
public List<Object> getInformationOfClient() {
    List<Object> clientPLanData = new ArrayList<>();
    clientPLanData.add(client);
    clientPLanData.add(phoneNumber);
    clientPLanData.add(balance);
    clientPLanData.add(receivables);
    clientPLanData.add(friends);
    return clientPLanData;
}


@Override
    public IPlanClient getByPhoneNumber(String phoneNumber) {
        if(phoneNumber == this.phoneNumber)
            return this;
        return null;
    }
}

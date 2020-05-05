package Proyecte;

import java.util.ArrayList;
import java.util.List;

public class PlanClientPrepago implements IPlanClient{

    Client client;
    String phoneNumber;
    String balance;
    String receivables;

    PlanClientPrepago (Client client, String phoneNumber){
        this.client = client;
        this.phoneNumber = phoneNumber;
        this.balance = "0";
        this.receivables = "0";
    }

	@Override
	public List<Object> getInformationOfClient() {
		List<Object> clientPLanData = new ArrayList<>();
        clientPLanData.add(client);
        clientPLanData.add(phoneNumber);
        clientPLanData.add(balance);
        clientPLanData.add(receivables);
		return clientPLanData;
    }
    
    @Override
    public IPlanClient getByPhoneNumber(String phoneNumber) {
        if(phoneNumber == this.phoneNumber)
            return this;
        return null;
    }

}

package Proyecte;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{


    public static void main(String[] args) {
        ClientRepository clientRepository = new FileClientRepository("clientangos.txt");
        Client cliente = new Client("Carlos", "34", "uhh");
        clientRepository.createClient(cliente);
        List<Client> clients = clientRepository.getAllClients();
        for(Client client : clients){
            System.out.println(client.name + client.address + client.ci);
        }
    }

    public static void printRecords(List<CallRecord> callRecords){
        for(CallRecord callRecord : callRecords)
            System.out.println(callRecord.toString());
    }


    public static List<CallRecord> initializeCallRecords() {
        List<CallRecord> callRecords = new ArrayList<>();
        CallRecord callRecord = new CallRecord();
        CallRecord callRecord2 = new CallRecord();
        CallRecord callRecord3 = new CallRecord();
        callRecord.callerPhoneNumber = "00000000";
        callRecord.callDuration = (float) 60;
        callRecord.startingCallTime = 12;
        callRecord.endPointPhoneNumber = "79789705";
        callRecords.add(callRecord);
        callRecord2.callerPhoneNumber = "11111111";
        callRecord2.callDuration = (float) 60;
        callRecord2.startingCallTime = 12;
        callRecord2.endPointPhoneNumber = "60774491";
        callRecords.add(callRecord2);
        callRecord3.callerPhoneNumber = "22222222";
        callRecord3.callDuration = (float) 60;
        callRecord3.startingCallTime = 12;
        callRecord3.endPointPhoneNumber = "79789705";
        callRecords.add(callRecord3);
        return callRecords;
    }

    static void initializeClientPlanData() {
        Client client = new Client();
        client.name = "Hector";
        client.ci = "12345";
        List<String> friends = new ArrayList<>();
        friends.add("60774491");
        IPlanClient plan = new PlanClientPostpago(client, "00000000", friends);
        RepositoryClientPlan.add(plan);
        client.name = "Dani";
        client.ci = "54321";
        plan = new PlanClientPrepago(client, "11111111");
        RepositoryClientPlan.add(plan);
        client.name = "Raquel";
        client.ci = "88947";
        List<String> friends2 = new ArrayList<>();
        friends2.add("79789705");
        friends2.add("79789704");
        plan = new PlanClientWow(client, "22222222", friends2);
        RepositoryClientPlan.add(plan);
    }

    static void calculateRates(List<CallRecord> callRecords) {
        for(CallRecord callRecord : callRecords){
            callRecord.calculateCost();
        }
    }

}

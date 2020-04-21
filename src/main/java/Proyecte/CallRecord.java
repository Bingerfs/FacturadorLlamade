package Proyecte;

public class CallRecord {
    Client callerClient;
    Client endpointClient;
    String date;
    String startingTime;
    String callLength;
    Integer callCost;

    public CallRecord(Client callerClient, Client endpointClient, String date, String startingTime, String callLength){
        this.callerClient = callerClient;
        this.endpointClient = endpointClient;
        this.date = date;
        this.startingTime = startingTime;
        this.callLength = callLength;
        callCost = calculateCosto();
    }

    private Integer calculateCosto(){
        return 0;
    }
}
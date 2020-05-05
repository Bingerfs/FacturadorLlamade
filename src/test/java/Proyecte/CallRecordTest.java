package Proyecte;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import java.util.List;

import java.util.ArrayList;

public class CallRecordTest {

    @Test
    public void createRecordPostpago(){
        Client client = new Client();
        client.address="asd";
        client.ci = "12345";
        List<String> friends = new ArrayList<>();
        friends.add("60774491");
        IPlanClient plan = new PlanClientPostpago(client, "00000000", friends);
        RepositoryClientPlan.add(plan);
        CallRecord record = new CallRecord();
        record.callDuration = (float)60;
        record.callerPhoneNumber = "00000000";
        record.endPointPhoneNumber = "60774491";
        record.startingCallTime = 4;
        record.calculateCost();
        Float expected = (float)0;
        assertEquals(expected, record.callCost);
    }
    
    @Test
    public void createRecordWoW(){
        Client client = new Client();
        client.address="asd";
        client.ci = "12345";
        List<String> friends = new ArrayList<>();
        friends.add("60774491");
        IPlanClient plan = new PlanClientWow(client, "00000000", friends);
        RepositoryClientPlan.add(plan);
        CallRecord record = new CallRecord();
        record.callDuration = (float)60;
        record.callerPhoneNumber = "00000000";
        record.endPointPhoneNumber = "60774491";
        record.startingCallTime = 4;
        record.calculateCost();
        Float expected = (float)0;
        assertEquals(expected, record.callCost);
    }
    @Test
    public void getInfoClientWoW(){
        Client client = new Client();
        client.address="asd";
        client.ci = "12345";
        List<String> friends = new ArrayList<>();
        friends.add("60774491");
        IPlanClient plan = new PlanClientWow(client, "00000000", friends);
        List<Object> clientPLanData = new ArrayList<>();
        clientPLanData.add(client);
        clientPLanData.add("00000000");
        clientPLanData.add(friends);
        assertEquals(clientPLanData, plan.getInformationOfClient());
    }
    @Test
    public void getInfoClientPrepago(){
        Client client = new Client();
        client.address="asd";
        client.ci = "12345";
        List<String> friends = new ArrayList<>();
        friends.add("60774491");
        IPlanClient plan = new PlanClientPrepago(client, "00000000");
        List<Object> clientPLanData = new ArrayList<>();
        clientPLanData.add(client);
        clientPLanData.add("00000000");
        assertEquals(clientPLanData, plan.getInformationOfClient());
    }
    @Test
    public void createRecordPrepago(){
        Client client = new Client();
        client.address="any";
        client.ci = "1251";
        IPlanClient plan = new PlanClientPrepago(client, "00000000");
        RepositoryClientPlan.add(plan);
        CallRecord record = new CallRecord();
        record.callDuration = (float)60;
        record.callerPhoneNumber = "00000000";
        record.endPointPhoneNumber = "60774491";
        record.startingCallTime = 4;
        record.calculateCost();
        Float expected = (float)0;
        assertEquals(expected, record.callCost);
    }
    @Test
    public void GetPhoneClientWOW(){
    	Client client = new Client();
        client.address="asd";
        client.ci = "12345";
        List<String> friends = new ArrayList<>();
        friends.add("60774491");
        IPlanClient plan = new PlanClientWow(client, "00000000", friends);
        assertEquals(plan, plan.getByPhoneNumber("00000000"));
    }
    @Test
    public void GetPhoneFalsefClientWOW(){
    	Client client = new Client();
        client.address="asd";
        client.ci = "12345";
        List<String> friends = new ArrayList<>();
        friends.add("60774491");
        IPlanClient plan2 = new PlanClientWow(client, "00000065", friends);
        assertEquals(null, plan2.getByPhoneNumber("00000000"));
    }
    @Test
    public void GetFalsePhoneClientPrepago(){
    	Client client = new Client();
        client.address="asd";
        client.ci = "12345";
        List<String> friends = new ArrayList<>();

        IPlanClient plan2 = new PlanClientPostpago(client, "00000065", friends);
        assertEquals(null, plan2.getByPhoneNumber("00000080"));
    }
    @Test
    public void GetPhoneClientPrepago(){
    	Client client = new Client();
        client.address="asd";
        client.ci = "12345";
        
        IPlanClient plan = new PlanClientPrepago(client, "00000000");
        assertEquals(plan, plan.getByPhoneNumber("00000000"));
    }
    @Test
    public void GetPhoneFalseClientPrepago(){
    	Client client = new Client();
        client.address="asd";
        client.ci = "12345";
        
        IPlanClient plan = new PlanClientPrepago(client, "00000000");
        assertEquals(null, plan.getByPhoneNumber("00006000"));
    }
    @Test
    public void GetPhoneFalsefClientPrepago(){
    	Client client = new Client();
        client.address="asd";
        client.ci = "12345";
      
        IPlanClient plan2 = new PlanClientPrepago(client, "00000065");
        assertEquals(null, plan2.getByPhoneNumber("00000000"));
    }
    
    //////////////////////////
    @Test
    public void createClientWithParams(){
        Client client = new Client();
        client.name="pepe";
        client.address="asd";
        client.ci = "12345";
        Client client2 = new Client(client.name,client.ci,client.address);
        assertEquals(client.ci, client2.ci);
    }
    
    
    @Test
    public void CallrecordToString(){
    	Client client = new Client();
        client.address="asd";
        client.ci = "12345";
        List<String> friends = new ArrayList<>();
        friends.add("60774491");
        IPlanClient plan = new PlanClientPostpago(client, "00000000", friends);
        RepositoryClientPlan.add(plan);
        CallRecord record = new CallRecord();
        record.callDuration = (float)60;
        record.callerPhoneNumber = "00000000";
        record.endPointPhoneNumber = "60774491";
        record.startingCallTime = 4;
        record.calculateCost();
        String record3 = "callerPhoneNumber: "+"00000000"+" endPointPhoneNumber= "+ "60774491" + " startingCallTime= "+"4"+
                " callDuration: "+"60.0"+" callCost: "+"0.0";
        assertEquals(record3, record.toString());

    }
   

}
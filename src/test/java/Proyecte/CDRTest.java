package Proyecte;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class CDRTest {


    @Test
    public void createCDR(){
        CDRRepository CDR=new CDRRepository();
        Client client = new Client();
        client.address="asd";
        client.ci = "12345";
        List<String> friends = new ArrayList<>();//friendgetterfromClient through Phone number
        friends.add("60774491");
        IPlanClient plan = new PlanClientPostpago(client, "00000000", friends);
        CallRecord record = new CallRecord();
        record.id_callRecord =1;
        record.callDuration = (float)60;
        record.callerPhoneNumber = "00000000";
        record.endPointPhoneNumber = "60774491";
        record.startingCallTime = 4;
        RepositoryClientPlan.add(plan);
        record.calculateCost();
        CDR.addCDR(record);
        assertEquals(true, CDR.FindCDRbyId(1));
    }



    @Test
    public void createCDRList(){
        CDRRepository CDR=new CDRRepository();
        Client client = new Client();
        client.address="asd";
        client.ci = "12345";
        List<String> friends = new ArrayList<>();//friendgetterfromClient through Phone number
        friends.add("60774491");

        IPlanClient plan = new PlanClientPostpago(client, "00000000", friends);
        CallRecord record = new CallRecord();
        record.id_callRecord =1;
        record.callDuration = (float)60;
        record.callerPhoneNumber = "00000000";
        record.endPointPhoneNumber = "60774491";
        record.startingCallTime = 4;

        CallRecord record1 = new CallRecord();
        record1.id_callRecord =2;
        record1.callDuration = (float)60;
        record1.callerPhoneNumber = "00000000";
        record1.endPointPhoneNumber = "60774491";
        record1.startingCallTime = 4;

        CallRecord record2 = new CallRecord();
        record1.id_callRecord =3;
        record1.callDuration = (float)60;
        record1.callerPhoneNumber = "00000000";
        record1.endPointPhoneNumber = "60774491";
        record1.startingCallTime = 4;
        RepositoryClientPlan.add(plan);
        record1.calculateCost();
        CDR.addCDR(record);
        CDR.addCDR(record1);
        CDR.addCDR(record2);
       assertEquals(false, CDR.FindCDRbyId(4));


    }
}

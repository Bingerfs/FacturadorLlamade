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

}
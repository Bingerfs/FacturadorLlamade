package Proyecte;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class RepositoryCDRTest {

    private RepositoryCDR repositoryCDR;
    private final Client client1 = new Client("Hector", "60774491");
    private final Client client2 = new Client("La dennis", "23");

    @Before
    public void setUp() {
        repositoryCDR = new RepositoryCDR();
        repositoryCDR.records.add(new CallRecord(client1, client2, "23", "5", "45"));
    }

    @Test
    public void retrieveCDR() {
        final CallRecord record = repositoryCDR.records.get(0);
        assertEquals(record.callerClient, client1);
        assertEquals(record.endpointClient, client2);
        assertEquals(record.date, "23");
        assertEquals(record.startingTime, "5");
    }

}
package Proyecte;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;


public class ClientTest {
    @Test
    public void createClient(){
        Client client = new Client("Hector", "12345");
        assertEquals("Error while creating Client", client.phoneNumber, "12345");
    }
    

}
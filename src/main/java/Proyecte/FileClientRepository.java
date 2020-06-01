package Proyecte;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class FileClientRepository implements ClientRepository {

    private String fileName;

    FileClientRepository(String fileName){
        this.fileName = fileName;
    }

    @Override
    public void createClient(Client client) {
        try {
            
            //clientFile.createNewFile();
            BufferedWriter out = new BufferedWriter(new FileWriter(fileName, true));
        String line =client.name + ", "+client.ci+", "+client.address; 
        out.write(line);
        out.newLine();
        out.close();   
        } catch (Exception e) {
            //TODO: handle exception
        }

    }

    @Override
    public List<Client> getAllClients() {
        List<Client> clients = new ArrayList<>();
        try {
        BufferedReader in = new BufferedReader(new FileReader(fileName));
		String str = "";
		while ((str = in.readLine()) != null) {
			String[] clientData = str.split(", ");
			Client client = new Client(clientData[0], clientData[1], clientData[2]);
			clients.add(client);
        }
        in.close();  
        } catch (Exception e) {
            //TODO: handle exception
        }
        return clients; 
    }
    
}
package Proyecte;

import java.util.ArrayList;

public class RepositoryCDR {
    public ArrayList<CallRecord> records;

    RepositoryCDR(){
        records = new ArrayList<>();
    }


    public ArrayList<CallRecord> searchRepositoriesByNumber(String telefono){
        ArrayList<CallRecord> retrievedRecords = new ArrayList<>();
        records.forEach(record -> {
            if(record.callerClient.phoneNumber == telefono)
                retrievedRecords.add(record);
        });
        return retrievedRecords;
    }
}
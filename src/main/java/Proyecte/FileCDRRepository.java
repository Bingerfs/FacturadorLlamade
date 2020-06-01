package Proyecte;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class FileCDRRepository implements ICDRRepository {

    private String fileName;

    public FileCDRRepository(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void addCallRecord(CallRecord callRecord) {
        

    }

    @Override
    public List<CallRecord> getAllCallRecords() {
        List<CallRecord> callRecords = new ArrayList<>();
        try {
            BufferedReader in = new BufferedReader(new FileReader(fileName));
		String str = "";
		str = in.readLine(); // skip header
		while ((str = in.readLine()) != null) {
			String[] callRecordData = str.split(", ");
			CallRecord callRecord = new CallRecord( Integer.parseInt(callRecordData[0]), callRecordData[1], callRecordData[2], callRecordData[3], Integer.parseInt(callRecordData[4]), Float.parseFloat(callRecordData[5]), Float.parseFloat(callRecordData[6]));
			callRecords.add(callRecord);
        }
        in.close();   
        } catch (Exception e) {
            //TODO: handle exception
        }
        return callRecords;
    }

    @Override
    public CallRecord getCallRecordById() {
        // TODO Auto-generated method stub
        return null;
    }

    

    

    
}
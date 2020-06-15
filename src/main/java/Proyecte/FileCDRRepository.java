package Proyecte;

import Proyecte.callRecord.CallRecordDto;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class FileCDRRepository implements ICDRRepository {

    private String fileName;
    FileCDRRepository() {

    }
    FileCDRRepository(String fileName) {
        this.fileName = fileName;
    }
    public void setFileName(String fileName){
        this.fileName=fileName;
    }
    @Override
    public void addCallRecord(CallRecordDto callRecord) {
        try {

            // clientFile.createNewFile();
            BufferedWriter out = new BufferedWriter(new FileWriter(fileName, true));
            String line = callRecord.id_callRecord + ", " + callRecord.callerPhoneNumber + ", " + callRecord.endPointPhoneNumber + ", " + callRecord.date + ", " + callRecord.startingCallTime + ", " + callRecord.callDuration + ", " + callRecord.callCost;
            out.write(line);
            out.newLine();
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

}

    @Override
    public List<CallRecord> getAllCallRecords()  {
        List<CallRecord> callRecords = new ArrayList<>();
        try {
            BufferedReader in = new BufferedReader(new FileReader(fileName));
		String str = "";
		str = in.readLine(); // skip header
		while ((str = in.readLine()) != null) {
			String[] callRecordData = str.split(", ");
			CallRecord callRecord = new CallRecord( Integer.parseInt(callRecordData[0]), callRecordData[1], callRecordData[2], callRecordData[3], Integer.parseInt(callRecordData[4]), Float.parseFloat(callRecordData[5]), Float.parseFloat(callRecordData[6]));
			callRecords.add(callRecord);
			System.out.println("datos"+callRecord);
        }
        in.close();   
        } catch (Exception e) {
            //TODO: handle exception
        }
        return callRecords;
    }

    @Override
    public CallRecord getCallRecordById(int id) {
        CallRecord callRecord = null;
        try {
            BufferedReader in = new BufferedReader(new FileReader(fileName));
            String str = "";
            while ((str = in.readLine()) != null) {
                String[] recordData = str.split(", ");
                if(id == Integer.parseInt(recordData[0])){
                    callRecord = new CallRecord(Integer.parseInt(recordData[0]), recordData[1], recordData[2], recordData[3], Integer.parseInt(recordData[4]), Float.parseFloat(recordData[5]), Float.parseFloat(recordData[6]));
                    break;
                }
            }
            in.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return callRecord;
    }


}
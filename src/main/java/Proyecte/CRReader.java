package Proyecte;

import Proyecte.callRecord.CallRecordDto;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public  class CRReader {
     public static String filename;

     public static List<CallRecord>getfilecdr(){
         List<CallRecord> callRecords = new ArrayList<>();
         try {
             BufferedReader in = new BufferedReader(new FileReader(filename));
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

}

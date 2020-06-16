package Proyecte;

import Proyecte.callRecord.CallRecordDto;

import java.io.FileNotFoundException;
import java.util.List;

public interface ICDRRepository {
    void addCallRecord(CallRecordDto callRecord);
    List<CallRecord> getAllCallRecords();
    CallRecord getCallRecordById(int id);
    List<CallRecord> getCallRecordsByPhoneNumber(String phoneNumber);
}
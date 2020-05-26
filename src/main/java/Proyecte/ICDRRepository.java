package Proyecte;

import java.util.List;

public interface ICDRRepository {
    void addCallRecord(CallRecord callRecord);
    List<CallRecord> getAllCallRecords();
    CallRecord getCallRecordById();

}
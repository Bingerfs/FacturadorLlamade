package Proyecte;

import java.io.FileNotFoundException;
import java.util.List;

public interface ICDRRepository {
    void addCallRecord(CallRecord callRecord);
    List<CallRecord> getAllCallRecords() throws FileNotFoundException, Exception;
    CallRecord getCallRecordById(int id);

}
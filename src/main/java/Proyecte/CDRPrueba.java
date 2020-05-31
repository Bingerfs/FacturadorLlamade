package Proyecte;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class CDRPrueba implements ICDRRepository {
    List<CallRecord> callRecordList=new ArrayList<>();
    @Override
    public void addCallRecord(CallRecord callRecord) {
        callRecordList.add(callRecord);
    }

    @Override
    public List<CallRecord> getAllCallRecords() throws FileNotFoundException, Exception {
        return this.callRecordList;
    }

    @Override
    public CallRecord getCallRecordById() {
        return null;
    }
}

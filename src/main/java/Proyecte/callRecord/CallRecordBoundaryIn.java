package Proyecte.callRecord;

import Proyecte.CallRecord;
import Proyecte.client.Client;
import Proyecte.client.ClientDto;

import java.util.HashMap;

public interface CallRecordBoundaryIn {
    HashMap<String, Object> getAllCallRecords();
    void createCallRecord(CallRecordDto client);
    CallRecord findCallRecordById(int ci);
}

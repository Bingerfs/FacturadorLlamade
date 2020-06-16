package Proyecte.callRecord;

import Proyecte.CallRecord;
import Proyecte.client.Client;
import Proyecte.client.ClientDto;

import java.util.HashMap;
import java.util.List;

public interface CallRecordBoundaryIn {
    List<CallRecordDto> getAllCallRecords();
    void createCallRecord(CallRecordDto callRecord);
    CallRecord findCallRecordById(int ci);
}

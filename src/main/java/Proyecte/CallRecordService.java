package Proyecte;

import Proyecte.callRecord.CallRecordBoundaryIn;
import Proyecte.callRecord.CallRecordBoundaryOut;
import Proyecte.callRecord.CallRecordDto;
import Proyecte.client.Client;
import Proyecte.client.ClientBoundaryIn;
import Proyecte.client.ClientBoundaryOut;
import Proyecte.client.ClientDto;

import java.util.HashMap;
import java.util.List;

public class CallRecordService implements CallRecordBoundaryIn {
    private ICDRRepository icdrRepository;
    private CallRecordBoundaryOut callRecordBoundaryOut;

     CallRecordService(ICDRRepository icdrRepository, CallRecordBoundaryOut callRecordBoundaryOut) {
        this.icdrRepository = icdrRepository;
        this.callRecordBoundaryOut = callRecordBoundaryOut;
    }

    @Override
    public HashMap<String, Object> getAllCallRecords(){
        List<CallRecord> callRecords =icdrRepository.getAllCallRecords();
        return callRecordBoundaryOut.showAllCallRecords(callRecords);
    }

    @Override
    public void createCallRecord(CallRecordDto client) {
        icdrRepository.addCallRecord(client);
    }

    @Override
    public CallRecord findCallRecordById(int ci) {
        return icdrRepository.getCallRecordById(ci);
    }
}

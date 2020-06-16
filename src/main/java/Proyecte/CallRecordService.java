package Proyecte;

import Proyecte.callRecord.CallRecordBoundaryIn;
import Proyecte.callRecord.CallRecordBoundaryOut;
import Proyecte.callRecord.CallRecordDto;
import Proyecte.callRecord.CallRecordMapper;
import Proyecte.client.Client;
import Proyecte.client.ClientBoundaryIn;
import Proyecte.client.ClientBoundaryOut;
import Proyecte.client.ClientDto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CallRecordService implements CallRecordBoundaryIn {
    private ICDRRepository icdrRepository;
    private CallRecordBoundaryOut callRecordBoundaryOut;
    private CallRecordMapper mapper;

     CallRecordService(ICDRRepository icdrRepository, CallRecordBoundaryOut callRecordBoundaryOut) {
        this.icdrRepository = icdrRepository;
        this.callRecordBoundaryOut = callRecordBoundaryOut;
        mapper = new CallRecordMapper();
    }

    @Override
    public List<CallRecordDto> getAllCallRecords(){
        List<CallRecordDto> callRecords = new ArrayList<>();
        for(CallRecord callRecord :icdrRepository.getAllCallRecords())
            callRecords.add(mapper.transClient(callRecord));
        return callRecords;
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

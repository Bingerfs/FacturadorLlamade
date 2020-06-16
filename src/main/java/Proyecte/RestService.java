package Proyecte;

import java.util.ArrayList;
import java.util.*;

import Proyecte.callRecord.CallRecordDto;
import Proyecte.callRecord.CallRecordMapper;

public class RestService implements RestBoundaryIn {
    private ICDRRepository icdrRepository;
    private CallRecordMapper mapper;
    @Override
    public List<CallRecordDto> getCallRecordsByPhone(String phoneNumber) {
        List<CallRecordDto> callRecords = new ArrayList<>();
        for(CallRecord callRecord : icdrRepository.getCallRecordsByPhoneNumber(phoneNumber))
            callRecords.add(mapper.transClient(callRecord));
        return callRecords;
    }

    public RestService(ICDRRepository icdrRepository) {
        this.icdrRepository = icdrRepository;
        mapper = new CallRecordMapper();
    }
    
}
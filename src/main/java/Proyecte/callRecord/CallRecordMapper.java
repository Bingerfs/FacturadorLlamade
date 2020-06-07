package Proyecte.callRecord;

import Proyecte.CallRecord;
import Proyecte.client.Client;
import Proyecte.client.ClientDto;

public class CallRecordMapper {
    public CallRecord transformCallRecord(CallRecordDto data){
        return new CallRecord(data.id_callRecord, data.callerPhoneNumber, data.endPointPhoneNumber,data.date,data.startingCallTime,data.callDuration,data.callCost);
    }

    public CallRecordDto transClient(CallRecord callRecord){
        return new CallRecordDto(callRecord.id_callRecord, callRecord.callerPhoneNumber, callRecord.endPointPhoneNumber,callRecord.date,callRecord.startingCallTime,callRecord.callDuration,callRecord.callCost);

    }
}
package Proyecte;

import java.util.List;

import Proyecte.callRecord.CallRecordDto;

public interface RestBoundaryIn {
    List<CallRecordDto> getCallRecordsByPhone(String phoneNumber);
}
package Proyecte.callRecord;

import Proyecte.CallRecord;
import Proyecte.client.Client;

import java.util.HashMap;
import java.util.List;

public interface CallRecordBoundaryOut {
    HashMap<String, Object> onShowAllCallRecords(List<CallRecordDto> callRecords);

    HashMap<String, Object> showAllCallRecords(List<CallRecord> list);
}

package Proyecte.callRecord;

import Proyecte.CallRecord;
import Proyecte.client.ClientBoundaryOut;

import java.util.HashMap;
import java.util.List;

public class CallRecordPresenter implements CallRecordBoundaryOut {

    @Override
    public HashMap<String, Object> onShowAllCallRecords(List<CallRecordDto> callRecords) {
        HashMap<String, Object> model = new HashMap<>();
        model.put("callRecords", callRecords);
        return model;
    }

}

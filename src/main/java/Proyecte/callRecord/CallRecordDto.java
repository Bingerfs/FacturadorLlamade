package Proyecte.callRecord;

public class CallRecordDto {

    public final int id_callRecord;
    public final String callerPhoneNumber;
    public final String endPointPhoneNumber;
    public final  String date;
    public final  Integer startingCallTime;
    public final Float callDuration;
    public final Float callCost;

     CallRecordDto(int id_callRecord, String callerPhoneNumber, String endPointPhoneNumber, String date, Integer startingCallTime, Float callDuration, Float callCost) {
        this.id_callRecord = id_callRecord;
        this.callerPhoneNumber = callerPhoneNumber;
        this.endPointPhoneNumber = endPointPhoneNumber;
        this.date = date;
        this.startingCallTime = startingCallTime;
        this.callDuration = callDuration;
        this.callCost = callCost;
    }
}

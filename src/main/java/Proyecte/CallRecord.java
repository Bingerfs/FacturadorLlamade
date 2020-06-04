package Proyecte;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CallRecord {
    int id_callRecord;
    String callerPhoneNumber;
    String endPointPhoneNumber;
    String date;
    Integer startingCallTime;
    Float callDuration;
    Float callCost;
    

    CallRecord(){
        callCost = (float)0;
        date="";
        id_callRecord = 0;

    }

    public void calculateCost() {
        IAccountRepository accountRepository = new SqlAccountRepository();
        Account account = accountRepository.getAccountByPhoneNumber(callerPhoneNumber);
        IRateCalculator calculator = RateCalculatorFactory.getRateCalculator(this, account);
        callCost = calculator.calculateRate();
    }

    @Override
    public String toString() {
        String record = "callerPhoneNumber: "+callerPhoneNumber+" endPointPhoneNumber= "+ endPointPhoneNumber + " startingCallTime= "+startingCallTime+
        " callDuration: "+callDuration+" callCost: "+callCost;
        return record;
    }

    public CallRecord(int id_callRecord, String callerPhoneNumber, String endPointPhoneNumber, String date,
            Integer startingCallTime, Float callDuration, Float callCost) {
        this.id_callRecord = id_callRecord;
        this.callerPhoneNumber = callerPhoneNumber;
        this.endPointPhoneNumber = endPointPhoneNumber;
        this.date = date;
        this.startingCallTime = startingCallTime;
        this.callDuration = callDuration;
        this.callCost = callCost;
    }

    

	


}
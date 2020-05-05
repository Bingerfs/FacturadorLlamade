package Proyecte;

import java.util.ArrayList;
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
        IPlanClient planClient = RepositoryClientPlan.findByPhoneNumber(callerPhoneNumber);
        List<Object> planClientData = planClient.getInformationOfClient();
        IRateCalculator calculator = RateCalculatorFactory.getRateCalculator(callDuration, planClient, planClientData,
                startingCallTime);
        callCost = calculator.calculateRate(endPointPhoneNumber);
    }

    @Override
    public String toString() {
        String record = "callerPhoneNumber: "+callerPhoneNumber+" endPointPhoneNumber= "+ endPointPhoneNumber + " startingCallTime= "+startingCallTime+
        " callDuration: "+callDuration+" callCost: "+callCost;
        return record;
    }

    

	


}
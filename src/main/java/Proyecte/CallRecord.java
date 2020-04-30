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

    public void calculateCost(IPlanClient plan){
        IPlanClient planClient = RepositoryClientPlan.findByPhoneNumber(callerPhoneNumber);
        System.out.println("idek");
        List<Object> planClientData = planClient.getInformationOfClient();
        System.out.println(planClientData);
        IRateCalculator calculator = RateCalculatorFactory.getRateCalculator(callDuration, planClient, planClientData, startingCallTime); 
        callCost = calculator.calculateRate(endPointPhoneNumber);
    }

    

	


}
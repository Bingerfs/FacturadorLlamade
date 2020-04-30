package Proyecte;

import java.util.ArrayList;
import java.util.List;

public class CallRecord {
    String callerPhoneNumber;
    String endPointPhoneNumber;
    String date;
    Integer startingCallTime;
    Float callDuration;
    Float callCost;

    public void calculateCost(IPlanClient plan){
    	List<String> friends = new ArrayList<>();//friendgetterfromClient through Phone number
        friends.add("60774491");
        IRateCalculator calculator = RateCalculatorFactory.getRateCalculator(callDuration, plan, friends, startingCallTime); 
        callCost = calculator.calculateRate(endPointPhoneNumber);
    }

    

	


}
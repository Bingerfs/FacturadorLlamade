package Proyecte;

import java.util.ArrayList;
import java.util.List;

public class CallRecord {
    String callerPhoneNumber;
    String endPointPhoneNumber;
    String date;
    Integer startingTime;
    Float callDuration;
    Float callCost;

    public void calculateCost(IPlanClient plan){
        IRateCalculator calculator = null;
        List<String> friends = new ArrayList<>();//friendgetterfromClient through Phone number
        friends.add("60774491");
        if(plan instanceof PlanClientPrepago)
            calculator = new RateCalculatorPrepago(callDuration, scheduleGetter());
        if(plan instanceof PlanClientPostpago)
            calculator = new RateCalculatorPostpago(callDuration, friends);
        if(plan instanceof PlanClientWow)
            calculator = new RateCalculatorWow(callDuration, friends);
        callCost = calculator.calculateRate(endPointPhoneNumber);
    }

    private IRateCalculatorBySchedule scheduleGetter(){
        IRateCalculatorBySchedule schedule = null;
        if(startingTime > 0 && startingTime < 5)
            schedule = new SuperReduceSchedulePrepago();
        if(startingTime > 5 && startingTime < 17 )
            schedule = new NormalSchedulePrepago();
        if(startingTime > 17 && startingTime < 0)
            schedule = new ReduceSchedulePrepago();
        return schedule;
    }

	


}
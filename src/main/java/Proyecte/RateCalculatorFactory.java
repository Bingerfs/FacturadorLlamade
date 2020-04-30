package Proyecte;

import java.util.List;

public class RateCalculatorFactory {
	
	public static IRateCalculator getRateCalculator(Float callDuration, IPlanClient plan, List<String> friends,Integer startingCallTime){
		
		IRateCalculator calculator = null;
		if(plan instanceof PlanClientPrepago)
	        calculator = new RateCalculatorPrepago(callDuration, PlanScheduleFactory.getPlanSchedule(startingCallTime));
		
	    if(plan instanceof PlanClientPostpago)
	        calculator = new RateCalculatorPostpago(callDuration, friends);
	    
	    if(plan instanceof PlanClientWow)
	        calculator = new RateCalculatorWow(callDuration, friends);
	    
	    return calculator;
	}

}

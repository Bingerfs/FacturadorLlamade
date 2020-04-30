package Proyecte;

import java.util.List;

public class RateCalculatorFactory {
	
	public static IRateCalculator getRateCalculator(Float callDuration, IPlanClient plan, List<Object> clientPlanData,Integer startingCallTime){
		
		IRateCalculator calculator = null;
		if(plan instanceof PlanClientPrepago)
			calculator = new RateCalculatorPrepago(callDuration, PlanScheduleFactory.getPlanSchedule(startingCallTime));
		@SuppressWarnings("unchecked")
		List<String> friends = (List<String>) clientPlanData.get(4);
		System.out.println(friends);
		
	    if(plan instanceof PlanClientPostpago)
	        calculator = new RateCalculatorPostpago(callDuration, friends);
	    
	    if(plan instanceof PlanClientWow)
	        calculator = new RateCalculatorWow(callDuration, friends);
	    
	    return calculator;
	}

}

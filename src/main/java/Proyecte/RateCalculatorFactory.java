package Proyecte;

import java.util.List;

public class RateCalculatorFactory {
	
	public static IRateCalculator getRateCalculator(CallRecord callRecord, Account account){
		
		IRateCalculator calculator = null;
		if(account.accoundType == "Prepago")
			calculator = new RateCalculatorPrepago(callRecord.callDuration, PlanScheduleFactory.getPlanSchedule(callRecord.startingCallTime), account.receivables);
		
	    if(account.accoundType == "Postpago")
	        calculator = new RateCalculatorPostpago(callRecord.callDuration, account.receivables, callRecord.endPointPhoneNumber);
	    
	    if(account.accoundType == "Wow")
	        calculator = new RateCalculatorWow(callRecord.callDuration, account.receivables, callRecord.endPointPhoneNumber);
	    
	    return calculator;
	}

}

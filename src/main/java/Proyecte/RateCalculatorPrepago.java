package Proyecte;

import java.util.ArrayList;
import java.util.List;

public class RateCalculatorPrepago implements IRateCalculator{
	
	
	
    private float ratePerMinute;
    private float totalRate;
    private float duration;
    private IRateCalculatorBySchedule schedule;
    private List<Receivable> receivables;

    public RateCalculatorPrepago( float duration, IRateCalculatorBySchedule schedule, List<Receivable> receivables) {
      
        this.ratePerMinute = (float)0;
        this.duration = duration;
        this.totalRate = 0;
        this.schedule = schedule;
        this.receivables = receivables;
    }

    @Override
    public Float calculateRate() {
        totalRate = (float)0;
		IRateCalculatorBySchedule iRateCalculatorBySchedule = schedule;
        ratePerMinute = iRateCalculatorBySchedule.getRatePerMinute();
        totalRate = duration*ratePerMinute;
        if(receivables !=null){
            for(Receivable receivable : receivables)
                receivable.applyReceivable(totalRate, null);
        } 
        return totalRate;
    }
    

	
	
	
	  	

	    
	
	
	

}

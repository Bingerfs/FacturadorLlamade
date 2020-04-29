package Proyecte;

import java.util.ArrayList;

public class RateCalculatorPrepago implements IRateCalculator{
	
	
	
    private float ratePerMinute;
    private float totalRate;
    private float duration;


    public RateCalculatorPrepago( float duration) {
      
        this.ratePerMinute = (float)0;
        this.duration = duration;
        this.totalRate = 0;
    }

	@Override
	public Float calculateRate(ArrayList<String> friends, IRateCalculatorBySchedule schedule) {
		totalRate = (float)0;
		IRateCalculatorBySchedule iRateCalculatorBySchedule = schedule;
        ratePerMinute = schedule.getRatePerMinute();
        totalRate = duration*ratePerMinute;
            return totalRate;
      
	}
	
	
	
	
	
	  	

	    
	
	
	

}

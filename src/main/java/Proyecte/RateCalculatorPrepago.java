package Proyecte;

import java.util.ArrayList;
import java.util.List;

public class RateCalculatorPrepago implements IRateCalculator{
	
	
	
    private float ratePerMinute;
    private float totalRate;
    private float duration;
    private IRateCalculatorBySchedule schedule;
    //private List<SpecialReceivables> receivables; Lista de diferentes abonos, minutos gratis
    //y descuentos por amigos


    public RateCalculatorPrepago( float duration, IRateCalculatorBySchedule schedule) {
      
        this.ratePerMinute = (float)0;
        this.duration = duration;
        this.totalRate = 0;
        this.schedule = schedule;
    }

    @Override
    public Float calculateRate(String endpointNumber) {
        totalRate = (float)0;
		IRateCalculatorBySchedule iRateCalculatorBySchedule = schedule;
        ratePerMinute = iRateCalculatorBySchedule.getRatePerMinute();
        totalRate = duration*ratePerMinute;
        //applySpecialReceivables(totalRate); Si es que tiene alguno
        return totalRate;
    }
    
    //@Override
    //public Float applySpecialReceivables(Rate){
        //for(......)
            //receivables.apply(Rate);
    //}
	
	
	
	  	

	    
	
	
	

}

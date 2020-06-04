package Proyecte;
import java.util.List;

import java.util.ArrayList;

public class RateCalculatorWow implements IRateCalculator{
    Float ratePerMinute = (float) 0.99;
    Float duration;
    String endpointNumber;
    List<Receivable> receivables;

    public RateCalculatorWow(Float duration, List<Receivable> receivables, String endpointNumber){
        this.duration = duration;
        this.receivables = receivables;
        this.endpointNumber = endpointNumber;
    }

    
    @Override
	public Float calculateRate() {
     
    	Float totalRate = (float) 0;
        totalRate = duration * ratePerMinute;
        if(receivables !=null){
            for(Receivable receivable : receivables)
                receivable.applyReceivable(totalRate, endpointNumber);
        } 
        return totalRate;
    }

    

}

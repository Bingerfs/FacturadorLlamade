package Proyecte;

import java.util.ArrayList;
import java.util.List;

/**
 * RateCalculatorPostpago
 */
public class RateCalculatorPostpago implements IRateCalculator {

    Float ratePerMinute = (float) 1;
    Float callDuration;
    String endpointNumber;
    List<Receivable> receivables;

    RateCalculatorPostpago(Float callDuration, List<Receivable> receivables, String endpointNumber){
        this.callDuration = callDuration;
        this.receivables = receivables;
        this.endpointNumber = endpointNumber;
    }

    @Override
    public Float calculateRate() {
        Float totalRate = (float) 0;
        totalRate = callDuration * ratePerMinute; 
        if(receivables != null){
            for(Receivable receivable : receivables)
                totalRate = receivable.applyReceivable(totalRate, endpointNumber);
        }
        return totalRate;
    }
    
    
}
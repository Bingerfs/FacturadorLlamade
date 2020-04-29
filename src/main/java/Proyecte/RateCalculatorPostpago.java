package Proyecte;

import java.util.ArrayList;
import java.util.List;

/**
 * RateCalculatorPostpago
 */
public class RateCalculatorPostpago implements IRateCalculator {

    Float ratePerMinute = (float) 1;
    Float callDuration;

    RateCalculatorPostpago(Float callDuration){
        this.callDuration = callDuration;
    }

    @Override
    public Float calculateRate(List<String> friends, String endpointNumber) {
        Float totalRate = (float) 0;
        if(!friends.contains(endpointNumber))
            totalRate = callDuration * ratePerMinute; 
        return totalRate;
    }
    
    
}
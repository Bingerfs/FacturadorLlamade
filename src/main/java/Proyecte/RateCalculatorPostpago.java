package Proyecte;

import java.util.ArrayList;
import java.util.List;

/**
 * RateCalculatorPostpago
 */
public class RateCalculatorPostpago implements IRateCalculator {

    Float ratePerMinute = (float) 1;
    Float callDuration;
    List<String> friends;

    RateCalculatorPostpago(Float callDuration, List<String> friends){
        this.callDuration = callDuration;
        this.friends = friends;
    }

    @Override
    public Float calculateRate(String endpointNumber) {
        Float totalRate = (float) 0;
        if(!friends.contains(endpointNumber))
            totalRate = callDuration * ratePerMinute; 
        return totalRate;
    }
    
    
}
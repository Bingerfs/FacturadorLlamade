package Proyecte;

import java.util.ArrayList;
import java.util.List;

/**
 * RateCalculatorPostpago
 */
public class RateCalculatorPostpago implements IRateCalculator {

    Float ratePerMinute = (float) 1;

    @Override
    public Float calculateRate(Float duracion, List<String> friends, String endpointNumber) {
        Float totalRate = (float) 0;
        if(!friends.contains(endpointNumber))
            totalRate = duracion * ratePerMinute; 
        return totalRate;

    }
    
    
}
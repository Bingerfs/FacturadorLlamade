package Proyecte;
import java.util.List;

import java.util.ArrayList;

public class RateCalculatorWow implements IRateCalculator{
    Float ratePerMinute = (float) 0.99;

    
    @Override
	public Float calculateRate(Float duracion, List<String> friends, String endpointNumber) {
     
    	Float totalRate = (float) 0;
        if(!friends.contains(endpointNumber))
            totalRate = duracion * ratePerMinute; 
        return totalRate;
    }

}

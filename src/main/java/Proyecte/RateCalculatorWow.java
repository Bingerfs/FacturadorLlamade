package Proyecte;
import java.util.List;

import java.util.ArrayList;

public class RateCalculatorWow implements IRateCalculator{
    Float ratePerMinute = (float) 0.99;
    Float duration;

    public RateCalculatorWow(Float duration){
        this.duration = duration;
    }

    
    @Override
	public Float calculateRate(List<String> friends, String endpointNumber) {
     
    	Float totalRate = (float) 0;
        if(!friends.contains(endpointNumber))
            totalRate = duration * ratePerMinute; 
        return totalRate;
    }

}

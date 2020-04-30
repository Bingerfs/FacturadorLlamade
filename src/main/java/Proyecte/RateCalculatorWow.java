package Proyecte;
import java.util.List;

import java.util.ArrayList;

public class RateCalculatorWow implements IRateCalculator{
    Float ratePerMinute = (float) 0.99;
    Float duration;
    List<String> friends;

    public RateCalculatorWow(Float duration, List<String> friends){
        this.duration = duration;
        this.friends = friends;
    }

    
    @Override
	public Float calculateRate(String endpointNumber) {
     
    	Float totalRate = (float) 0;
        if(!friends.contains(endpointNumber))
            totalRate = duration * ratePerMinute; 
        return totalRate;
    }

}

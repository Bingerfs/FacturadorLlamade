package Proyecte;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import java.util.List;

import java.util.ArrayList;
public class PlanTest {


    @Test
    public void calculateNormalSchedulePrepago() {
        IRateCalculatorBySchedule schedule = new NormalSchedulePrepago();
    	IRateCalculator calculator = new RateCalculatorPrepago((float)60, schedule);
    	Float result = calculator.calculateRate(null, "");
    	Float expected = (float) 87.0;
    	assertEquals(expected, result);
    	
    }
    
    @Test
    public void calculateReduceSchedulePrepago() {
        IRateCalculatorBySchedule schedule = new ReduceSchedulePrepago();
    	IRateCalculator calculator = new RateCalculatorPrepago((float)60, schedule);
    	Float result = calculator.calculateRate(null, "");
    	Float expected = (float) 57.0;
    	assertEquals(expected, result);
    	
    }

    @Test
    public void calculateSuperReduceSchedulePrepago() {
        IRateCalculatorBySchedule schedule = new SuperReduceSchedulePrepago();
    	IRateCalculator calculator = new RateCalculatorPrepago((float)60, schedule);
    	Float result = calculator.calculateRate(null, "");
    	Float expected = (float) 42.0;
    	assertEquals(expected, result);
    	
    }
    
    

    @Test
    public void calculateWow(){
        Float callLength = (float) 60;
        IRateCalculator calculador = new RateCalculatorWow(callLength);
        List<String> friends = new ArrayList<>();
        friends.add("60774491");
        friends.add("79789704");
        friends.add("79789705");
        Float expected = (float) 59.4;
        Float rate = calculador.calculateRate(friends, "75757575");
        assertEquals(expected, rate);
    }
    
    @Test
    public void calculateWowFriend(){
        Float callLength = (float) 60;
        IRateCalculator calculador = new RateCalculatorWow(callLength);
        List<String> friends = new ArrayList<>();
        friends.add("60774491");
        friends.add("79789704");
        friends.add("79789705");
        Float expected = (float) 0;
        Float rate = calculador.calculateRate(friends, "60774491");
        assertEquals(expected, rate);
    }

    public void calculatePostpago(){
        Float callLength = (float) 60;
        IRateCalculator calculador = new RateCalculatorPostpago(callLength);
        List<String> friends = new ArrayList<>();
        friends.add("60774491");
        friends.add("79789704");
        friends.add("79789705");
        Float expected = (float) 60;
        Float rate = calculador.calculateRate(friends, "75757575");
        assertEquals(expected, rate);
    }
    
    @Test
    public void calculatePostpagoFriend(){
        Float callLength = (float) 60;
        IRateCalculator calculador = new RateCalculatorPostpago(callLength);
        List<String> friends = new ArrayList<>();
        friends.add("60774491");
        friends.add("79789704");
        friends.add("79789705");
        Float expected = (float) 0;
        Float rate = calculador.calculateRate(friends, "60774491");
        assertEquals(expected, rate);
    }
    

}
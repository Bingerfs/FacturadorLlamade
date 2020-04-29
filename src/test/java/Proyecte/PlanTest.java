package Proyecte;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

public class PlanTest {

    @Test
    public void calculateNormalSchedulePrepago() {
        IRateCalculatorBySchedule schedule = new NormalSchedulePrepago();
    	IRateCalculator calculator = new RateCalculatorPrepago((float)60, schedule);
    	Float result = calculator.calculateRate();
    	Float expected = (float) 87.0;
    	assertEquals(expected, result);
    	
    }
    
    @Test
    public void calculateReduceSchedulePrepago() {
        IRateCalculatorBySchedule schedule = new ReduceSchedulePrepago();
    	IRateCalculator calculator = new RateCalculatorPrepago((float)60, schedule);
    	Float result = calculator.calculateRate();
    	Float expected = (float) 57.0;
    	assertEquals(expected, result);
    	
    }

    @Test
    public void calculateSuperReduceSchedulePrepago() {
        IRateCalculatorBySchedule schedule = new SuperReduceSchedulePrepago();
    	IRateCalculator calculator = new RateCalculatorPrepago((float)60, schedule);
    	Float result = calculator.calculateRate();
    	Float expected = (float) 42.0;
    	assertEquals(expected, result);
    	
    }
    
  
    

}
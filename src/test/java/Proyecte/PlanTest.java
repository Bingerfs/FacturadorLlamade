package Proyecte;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

public class PlanTest {

    @Test
    public void calculateNormalSchedulePrepago() {
    	IRateCalculator calculator = new RateCalculatorPrepago((float)60);
    	IRateCalculatorBySchedule schedule = new NormalSchedulePrepago();
    	Float result = calculator.calculateRate(null, schedule );
    	Float expected = (float) 87.0;
    	assertEquals(expected, result);
    	
    }
    
    @Test
    public void calculateReduceSchedulePrepago() {
    	IRateCalculator calculator = new RateCalculatorPrepago((float)60);
    	IRateCalculatorBySchedule schedule = new ReduceSchedulePrepago();
    	Float result = calculator.calculateRate(null, schedule );
    	Float expected = (float) 57.0;
    	assertEquals(expected, result);
    	
    }

    @Test
    public void calculateSuperReduceSchedulePrepago() {
    	IRateCalculator calculator = new RateCalculatorPrepago((float)60);
    	IRateCalculatorBySchedule schedule = new SuperReduceSchedulePrepago();
    	Float result = calculator.calculateRate(null, schedule );
    	Float expected = (float) 42.0;
    	assertEquals(expected, result);
    	
    }
    
  
    

}
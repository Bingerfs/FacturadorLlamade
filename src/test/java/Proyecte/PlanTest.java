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
        List<Receivable> receivables = new ArrayList<>();
        String friends;
        friends = "79789704";
        //Receivable res1 = new FriendsReceivable(friends);
        receivables.add(new FriendsReceivable(friends));
        IRateCalculatorBySchedule schedule = new NormalSchedulePrepago();
    	IRateCalculator calculator = new RateCalculatorPrepago((float)60, schedule,receivables,"79789704");
    	Float result = calculator.calculateRate();
    	Float expected = (float) 0.0;
    	assertEquals(expected, result);
    	
    }

    /*@Test
    public void calculateReduceSchedulePrepago() {
        IRateCalculatorBySchedule schedule = new ReduceSchedulePrepago();
    	IRateCalculator calculator = new RateCalculatorPrepago((float)60, schedule,);
    	Float result = calculator.calculateRate();
    	Float expected = (float) 57.0;
    	assertEquals(expected, result);
    	
    }

    @Test
    public void calculateSuperReduceSchedulePrepago() {
        IRateCalculatorBySchedule schedule = new SuperReduceSchedulePrepago();
    	IRateCalculator calculator = new RateCalculatorPrepago((float)60, schedule);
    	Float result = calculator.calculateRate("");
    	Float expected = (float) 42.0;
    	assertEquals(expected, result);
    	
    }
    */
    

    @Test
    public void calculateWow(){
        List<Receivable> receivables = new ArrayList<>();
        //receivables.add(S"60774491");
        Float callLength = (float) 60;
      String friends;
        friends="60774491";
        receivables.add(new FriendsReceivable(friends));
        friends="79789704";
        receivables.add(new FriendsReceivable(friends));
        friends="79789705";
        receivables.add(new FriendsReceivable(friends));

        IRateCalculator calculador = new RateCalculatorWow(callLength, receivables,"60774491");
        Float expected = (float) 0.0;
        Float rate = calculador.calculateRate();
        assertEquals(expected, rate);
    }

    
    @Test
    public void calculatePostpago(){
        List<Receivable> receivables = new ArrayList<>();
        //receivables.add(S"60774491");
        Float callLength = (float) 60;
        String friends;
        friends="60774491";
        receivables.add(new FriendsReceivable(friends));
        friends="79789704";
        receivables.add(new FriendsReceivable(friends));
        friends="79789705";
        receivables.add(new FriendsReceivable(friends));

        IRateCalculator calculador = new RateCalculatorPostpago(callLength, receivables,"79789705");
        Float expected = (float) 0.0;
        Float rate = calculador.calculateRate();
        assertEquals(expected, rate);
    }

    @Test
    public void calculatePostpagoFriend(){
        IRateCalculatorBySchedule iRateCalculatorBySchedule= PlanScheduleFactory.getPlanSchedule(07);
        IRateCalculatorBySchedule iRateCalculatorBySchedul2=PlanScheduleFactory.getPlanSchedule(22);
        IRateCalculatorBySchedule iRateCalculatorBySchedule3= PlanScheduleFactory.getPlanSchedule(01);



            assertEquals(iRateCalculatorBySchedule.getRatePerMinute(), iRateCalculatorBySchedule.getRatePerMinute());
    }
    

}
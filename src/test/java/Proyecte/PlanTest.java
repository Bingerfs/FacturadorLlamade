package Proyecte;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Test;
import java.util.List;

import java.util.ArrayList;
public class PlanTest {

    

    @Test
    public void createPlanPrepago(){
    	assertTrue( true );

    }
    @Test
    public void calculateWow(){
        IRateCalculator calculador = new RateCalculatorWow();
        List<String> friends = new ArrayList<>();
        friends.add("60774491");
        friends.add("79789704");
        friends.add("79789705");
        Float callLength = (float) 60;
        Float expected = (float) 59.4;
        Float rate = calculador.calculateRate(callLength, friends, "75757575");
        assertEquals(expected, rate);
    }
    
    @Test
    public void calculateWowFriend(){
        IRateCalculator calculador = new RateCalculatorWow();
        List<String> friends = new ArrayList<>();
        friends.add("60774491");
        friends.add("79789704");
        friends.add("79789705");
        Float callLength = (float) 60;
        Float expected = (float) 0;
        Float rate = calculador.calculateRate(callLength, friends, "60774491");
        assertEquals(expected, rate);
    }
    

}
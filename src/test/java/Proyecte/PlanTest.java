package Proyecte;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

public class PlanTest {

    private Plan plan;

    @Test
    public void createPlanPrepago(){

        ArrayList<String> expectedFriends = new ArrayList<>();
        expectedFriends.add("60774491");
        plan = new Plan("Postpago");
        plan.abono = "Ninguno";
        plan.antiguedad = 0;
        plan.friends.add("60774491");
        assertEquals("Ninguno", plan.abono);
        assertEquals((Integer)0, plan.antiguedad);
        assertEquals(expectedFriends, plan.friends);
        assertEquals(RateCalculatorPresaldo.class, plan.rateCalculator.getClass());
    }

    

}
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
        plan.receiveable = "Ninguno";
        plan.loyaltyYears = 0;
        plan.friends.add("60774491");
        assertEquals("Ninguno", plan.receiveable);
        assertEquals((Integer)0, plan.loyaltyYears);
        assertEquals(expectedFriends, plan.friends);
        assertEquals(RateCalculatorPresaldo.class, plan.rateCalculator.getClass());
    }

    

}
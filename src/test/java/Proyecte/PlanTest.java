package Proyecte;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class PlanTest {


    @Test
    public void calculatePostpago(){
        IRateCalculator calculador = new RateCalculatorPostpago();
        List<String> friends = new ArrayList<>();
        friends.add("60774491");
        friends.add("79789704");
        friends.add("79789705");
        Float duracion = (float) 60;
        Float expected = (float) 60;
        Float rate = calculador.calcularTarifa(duracion, friends, "75757575");
        assertEquals(expected, rate);
    }
    
    @Test
    public void calculatePostpagoFriend(){
        IRateCalculator calculador = new RateCalculatorPostpago();
        List<String> friends = new ArrayList<>();
        friends.add("60774491");
        friends.add("79789704");
        friends.add("79789705");
        Float duracion = (float) 60;
        Float expected = (float) 0;
        Float rate = calculador.calcularTarifa(duracion, friends, "60774491");
        assertEquals(expected, rate);
    }
    

}
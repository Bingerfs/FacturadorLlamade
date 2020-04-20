package Proyecte;

import java.util.ArrayList;

public class Plan {
    String type;
    ArrayList<String> friends;
    Integer antiguedad;
    Integer saldo;
    String abono;
    IRateCalculator rateCalculator;
    public Plan(String type) {
        switch(type){
            case "Prepago":
            rateCalculator = new RateCalculatorPresaldo();
            break;
            case "Postpago":
            System.out.println("To do");
            break;
            case "Wow":
            System.out.println("To do");
            break;
        }
        friends = new ArrayList<>();
    }


}
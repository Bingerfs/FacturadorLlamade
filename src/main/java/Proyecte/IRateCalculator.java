package Proyecte;

import java.util.ArrayList;

public interface IRateCalculator {

    Float calculateRate(ArrayList<String> friends, IRateCalculatorBySchedule schedule);
}
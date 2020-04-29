package Proyecte;

import java.util.ArrayList;
import java.util.List;

public interface IRateCalculator {


    Float calculateRate(Float duracion, List<String> friends, String endpointNumber);

}
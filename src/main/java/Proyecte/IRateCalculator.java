package Proyecte;

import java.util.ArrayList;
import java.util.List;

public interface IRateCalculator {

    Float calcularTarifa(Float duracion, List<String> friends, String endpointNumber);
}
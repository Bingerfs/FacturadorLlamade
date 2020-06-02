package Proyecte;

import java.util.HashMap;
import java.util.List;

public interface ClientBoundaryOut {
    HashMap<String, Object> showAllClients(List<Client> clients);
}
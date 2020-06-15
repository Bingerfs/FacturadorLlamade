package Proyecte.client;

import Proyecte.client.Client;

import java.util.HashMap;
import java.util.List;

public interface ClientBoundaryOut {
    HashMap<String, Object> showAllClients(List<ClientDto> clients);
}
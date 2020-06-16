package Proyecte;

import java.util.*;

public interface AccountBoundaryOut {
    HashMap<String, Object> onSaveAccountsFromFile(List<Account> accounts);
}
package Proyecte;

import java.util.HashMap;
import java.util.List;

public class AccountPresenter implements AccountBoundaryOut {

    @Override
    public HashMap<String, Object> onSaveAccountsFromFile(List<Account> accounts) {
        HashMap<String, Object> model = new HashMap<>();
        model.put("accounts", accounts);
        return model;
    }
    
}
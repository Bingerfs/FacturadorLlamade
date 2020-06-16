package Proyecte;

import static Proyecte.RequestUtil.*;

import java.util.HashMap;

import Proyecte.client.ClientBoundaryIn;
import spark.Request;
import spark.Response;
import spark.Route;

public class AccountController {
    private AccountBoundaryIn accountBoundaryIn;
    private AccountBoundaryOut accountBoundaryOut;

    public AccountController(AccountBoundaryIn accountBoundaryIn, AccountBoundaryOut accountBoundaryOut) {
        this.accountBoundaryIn = accountBoundaryIn;
        this.accountBoundaryOut = accountBoundaryOut;
    }

    public Route renderView = (Request request, Response response) -> {
        HashMap<String, Object> model = new HashMap<>();
        return ViewUtil.render(request, model, Path.Template.UPACCOUNTS);
    };
    
    public Route saveAccounts = (Request request, Response response) -> {
        String filepath=getfileurl(request);
        AccountReader.filename = filepath;
        HashMap<String, Object> model = accountBoundaryOut.onSaveAccountsFromFile(AccountReader.readFile());
        for(Account account : AccountReader.accounts)
            accountBoundaryIn.createAccount(account);
        return ViewUtil.render(request, model, Path.Template.ACCOUNTS);
        };

    
}
package Proyecte;

import static Proyecte.RequestUtil.*;

import java.util.HashMap;

import Proyecte.client.ClientBoundaryIn;
import spark.Request;
import spark.Response;
import spark.Route;

public class AccountController {
    private AccountBoundaryIn accountBoundaryIn;

    public AccountController(AccountBoundaryIn accountBoundaryIn) {
        this.accountBoundaryIn = accountBoundaryIn;
    }

    public Route renderView = (Request request, Response response) -> {
        HashMap<String, Object> model = new HashMap<>();
        return ViewUtil.render(request, model, Path.Template.UPACCOUNTS);
    };
    
    public Route saveAccounts = (Request request, Response response) -> {
        String filepath=getfileurl(request);
        System.out.println("fle is "+filepath);
        AccountReader.filename = filepath;
        HashMap<String, Object> model = new HashMap<>();
        model.put("accounts", AccountReader.readFile());
        for(Account account : AccountReader.accounts)
            accountBoundaryIn.createAccount(account);
        return ViewUtil.render(request, model, Path.Template.ACCOUNTS);
        };

    
}
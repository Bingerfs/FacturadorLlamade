package Proyecte;

public class AccountController {
    private AccountBoundaryIn accountBoundaryIn;

    public AccountController(AccountBoundaryIn accountBoundaryIn) {
        this.accountBoundaryIn = accountBoundaryIn;
    }
    
    public Route getAllAccounts = (Request request, Response response) -> {
        return ViewUtil.render(request, callRecordBoundaryIn.getAllAccounts(), Path.Template.CALLRECORDS_ALL);
    };
}
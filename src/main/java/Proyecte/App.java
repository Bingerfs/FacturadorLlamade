package Proyecte;

import java.util.ArrayList;
import java.util.List;
import static spark.Spark.*;
import static spark.debug.DebugScreen.*;
/**
 * Hello world!
 *
 */
public class App 
{

    public static ICDRRepository icdrRepository=new CDRPrueba();
    public static List<CallRecord> callRecordList=new ArrayList<>();
    public static  UIController uiController=new UIController();
    public static ClientController clientController = new ClientController(new ClientService(new SqlClientRepository(), new ClientPresenter()));

    public static void main(String[] args) {


        port(4567);
        staticFiles.location("/public");
        staticFiles.expireTime(600L);
        enableDebugScreen();

        before("*",                  Filters.addTrailingSlashes);
        before("*",                  Filters.handleLocaleChange);

       // get(Path.Web.CALLRECORDS,    uiController.fetchAllBooks);
        get(Path.Web.INDEX,    uiController.index);
        get(Path.Web.CLIENTS_ALL,   clientController.getAllClients);

        //get("*",                     ViewUtil.notFound);

        after("*",                   Filters.addGzipHeader);

        /*IClientRepository repository = new SqlClientRepository();
        Client client = repository.getClientByCi("5656");
        System.out.println(client.name);
        IAccountRepository repositorya = new SqlAccountRepository();
        List<Receivable> receivables = new ArrayList<>();
        List<String> friends = new ArrayList<>();
        friends.add("79789704");
        receivables.add(new FriendsReceivable(friends));
        Account account = new Account(client, "60774491", receivables, "Prepago");
        repositorya.createAccount(account);*/

    }
}

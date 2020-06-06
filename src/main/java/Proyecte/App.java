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
    //public static ClientController clientController = new ClientController(new ClientService(new SqlClientRepository(), new ClientPresenter()));

    public static void main(String[] args) {


        /*port(4567);
        staticFiles.location("/public");
        staticFiles.expireTime(600L);
        enableDebugScreen();

        before("*",                  Filters.addTrailingSlashes);
        before("*",                  Filters.handleLocaleChange);

       // get(Path.Web.CALLRECORDS,    uiController.fetchAllBooks);
        get(Path.Web.INDEX,    uiController.index);
        get(Path.Web.CLIENTS_ALL,   clientController.getAllClients);

        //get("*",                     ViewUtil.notFound);

        after("*",                   Filters.addGzipHeader);*/

        //IClientRepository clientR = new FileClientRepository("clientangos.txt");
        //Client client = clientR.getClientByCi("34");
        //IAccountRepository repositorya = new FileAccountRepository("Accounts.txt", "Receivables.txt", new FileClientRepository("clientangos.txt"));
        /*List<Receivable> receivables = new ArrayList<>();
        String friends;
        friends = "79789704";
        receivables.add(new FriendsReceivable(friends));
        Account account = new Account(client, "60774491", receivables, "Prepago");
        repositorya.createAccount(account);*/
        //Account account3 = repositorya.getAccountByPhoneNumber("60774491");

        ICDRRepository repository = new FileCDRRepository("Records.txt");
        repository.getCallRecordById(0);
    }
}

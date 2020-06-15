package Proyecte;

import Proyecte.callRecord.CallRecordPresenter;
import Proyecte.client.Client;
import Proyecte.client.ClientPresenter;

import java.io.File;
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

    public static List<CallRecord> callRecordList=new ArrayList<>();
    public static  UIController uiController=new UIController();
    public static ClientController clientController = new ClientController(new ClientService(new SqlClientRepository(), new ClientPresenter()));
   public static ICDRRepository icdrRepository=new FileCDRRepository();
    public static CallRecordController callRecordController = new CallRecordController(new CallRecordService(new FileCDRRepository("Records.txt"), new CallRecordPresenter()));

    public static void main(String[] args) {
        File storageDir = new File("storage");
        if (!storageDir.isDirectory()) storageDir.mkdir();
        System.out.println("file name "+ CRReader.filename);

        port(4567);
        staticFiles.location("/public");
        staticFiles.expireTime(600L);
        enableDebugScreen();

        before("*",                  Filters.addTrailingSlashes);
        before("*",                  Filters.handleLocaleChange);

       // get(Path.Web.CALLRECORDS,    uiController.fetchAllBooks);
        get(Path.Web.INDEX,    uiController.index);
        get(Path.Web.CLIENTS_ALL,   clientController.getAllClients);
        get(Path.Web.CALLRECORDS,   callRecordController.getAllCallRecords);
        post(Path.Web.INDEX,callRecordController.getfileCallrecords);
        get(Path.Web.RCALLRECORDS, callRecordController.rateUploadedRecords);
        post(Path.Web.CALLRECORDS, callRecordController.saveCdrList);
        //get("*",                     ViewUtil.notFound);

        after("*",                   Filters.addGzipHeader);

        /*IClientRepository clientR = new FileClientRepository("clientangos.txt");
        Client client = clientR.getClientByCi("34");
        IAccountRepository repositorya = new FileAccountRepository("Accounts.txt", "Receivables.txt", new FileClientRepository("clientangos.txt"));
        List<Receivable> receivables = new ArrayList<>();
        String friends;
        friends = "79789704";
        receivables.add(new FriendsReceivable(friends));
        Account account = new Account(client, "60774491", receivables, "Prepago");
        repositorya.createAccount(account);
        Account account3 = repositorya.getAccountByPhoneNumber("60774491");*/

        //CallRecord callRecord = new CallRecord("60774491", "79789705", "12", 12, (float)6.0, (float)0.0);
        //callRecord.calculateCost();
        //System.out.println(callRecord);

        //ICDRRepository repository = new FileCDRRepository("Records.txt");
        //repository.getCallRecordById(0);
    }
}

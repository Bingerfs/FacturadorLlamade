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

    public static void main(String[] args) {
        CallRecord callRecord = new CallRecord();
        CallRecord callRecord2 = new CallRecord();
        CallRecord callRecord3 = new CallRecord();
        callRecord.callerPhoneNumber = "00000000";
        callRecord.callDuration = (float) 60;
        callRecord.startingCallTime = 12;
        callRecord.endPointPhoneNumber = "79789705";
        callRecord2.callerPhoneNumber = "11111111";
        callRecord2.callDuration = (float) 60;
        callRecord2.startingCallTime = 12;
        callRecord2.endPointPhoneNumber = "60774491";
        callRecord3.callerPhoneNumber = "22222222";
        callRecord3.callDuration = (float) 60;
        callRecord3.startingCallTime = 12;
        callRecord3.endPointPhoneNumber = "79789705";
        icdrRepository=new CDRPrueba();
        icdrRepository.addCallRecord(callRecord);
        icdrRepository.addCallRecord(callRecord2);
        icdrRepository.addCallRecord(callRecord3);



        List<CallRecord> callRecords = new ArrayList<>();
        callRecords = initializeCallRecords();
        System.out.println("--------------Sin costo---------------");
        initializeClientPlanData();
        printRecords(callRecords);
        calculateRates(callRecords);
        System.out.println("--------------Con costo---------------");
        printRecords(callRecords);


        port(4567);
        staticFiles.location("/public");
        staticFiles.expireTime(600L);
        enableDebugScreen();

        before("*",                  Filters.addTrailingSlashes);
        before("*",                  Filters.handleLocaleChange);

       // get(Path.Web.CALLRECORDS,    uiController.fetchAllBooks);
        get(Path.Web.INDEX,    uiController.index);

        //get("*",                     ViewUtil.notFound);

        after("*",                   Filters.addGzipHeader);


        List<String> list =new ArrayList<>();
        list.add("ana");
        list.add("pepe");
        list.add("julia");
        list.add("dani");
        UIBoundaryOut uiservice=new UIPresenter();
        uiservice.showCallRecords(list,"nuevo valor");


    }

    public static void printRecords(List<CallRecord> callRecords){
        for(CallRecord callRecord : callRecords)
            System.out.println(callRecord.toString());
    }


    public static List<CallRecord> initializeCallRecords() {
        List<CallRecord> callRecords = new ArrayList<>();
        CallRecord callRecord = new CallRecord();
        CallRecord callRecord2 = new CallRecord();
        CallRecord callRecord3 = new CallRecord();
        callRecord.callerPhoneNumber = "00000000";
        callRecord.callDuration = (float) 60;
        callRecord.startingCallTime = 12;
        callRecord.endPointPhoneNumber = "79789705";
        callRecords.add(callRecord);
        callRecord2.callerPhoneNumber = "11111111";
        callRecord2.callDuration = (float) 60;
        callRecord2.startingCallTime = 12;
        callRecord2.endPointPhoneNumber = "60774491";
        callRecords.add(callRecord2);
        callRecord3.callerPhoneNumber = "22222222";
        callRecord3.callDuration = (float) 60;
        callRecord3.startingCallTime = 12;
        callRecord3.endPointPhoneNumber = "79789705";
        callRecords.add(callRecord3);
        return callRecords;
    }

    static void initializeClientPlanData() {
        Client client = new Client();
        client.name = "Hector";
        client.ci = "12345";
        List<String> friends = new ArrayList<>();
        friends.add("60774491");
        IPlanClient plan = new PlanClientPostpago(client, "00000000", friends);
        RepositoryClientPlan.add(plan);
        client.name = "Dani";
        client.ci = "54321";
        plan = new PlanClientPrepago(client, "11111111");
        RepositoryClientPlan.add(plan);
        client.name = "Raquel";
        client.ci = "88947";
        List<String> friends2 = new ArrayList<>();
        friends2.add("79789705");
        friends2.add("79789704");
        plan = new PlanClientWow(client, "22222222", friends2);
        RepositoryClientPlan.add(plan);
    }

    static void calculateRates(List<CallRecord> callRecords) {
        for(CallRecord callRecord : callRecords){
            callRecord.calculateCost();
        }
    }

}

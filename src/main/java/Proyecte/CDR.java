package Proyecte;

import java.util.ArrayList;
import java.util.List;

public class CDR {

    IPersitOperator persistOperator;
    List<CallRecord>list=new ArrayList<>();

    public CDR(){

    }

    public CDR(IPersitOperator persistOperator) {
        this.persistOperator = persistOperator;
    }

    public void addCDR(CallRecord obj){
        //persistOperator.add(obj);
        this.list.add(obj);
    }
    public List<CallRecord> getAllCDR(){
        //persistOperator.getAll();
        return this.list;
    }
    public List<CallRecord> getCDRClient(String callerPhoneNumber){
        List<CallRecord>returnlist=new ArrayList<>();

        for (CallRecord cr:list){
                if (cr.callerPhoneNumber.equals(callerPhoneNumber)){
                    returnlist.add(cr);
                }
        }
        return returnlist;
    }

    public boolean FindCDRbyId(int id_CallRecord){
        //persistOperator.getById();
        System.out.println("this id is ");

        boolean res=false;
        for (CallRecord cr:this.list){
            System.out.println("this id is "+cr.id_callRecord);
            if (id_CallRecord==cr.id_callRecord){
                    return res=true;
            }
        }

        return res;
    }
    }

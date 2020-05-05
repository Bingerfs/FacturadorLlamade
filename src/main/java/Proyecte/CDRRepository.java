package Proyecte;

import java.util.ArrayList;
import java.util.List;

public class CDRRepository {

    IPersitOperator persistOperator;//Las clases que implementen diferentes tecnologias tendrian que implementar esta abstraccion
    List<CallRecord>list=new ArrayList<>();

    public CDRRepository(){

    }

    public CDRRepository(IPersitOperator persistOperator) {
        this.persistOperator = persistOperator;
    }

    public void addCDR(CallRecord obj){
        this.list.add(obj);
    }
    public List<CallRecord> getAllCDR(){
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

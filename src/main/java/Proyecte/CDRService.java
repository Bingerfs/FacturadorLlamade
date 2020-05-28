package Proyecte;

import java.util.ArrayList;
import java.util.List;

public class CDRService {

    ICDRRepository cdrRepository;//Las clases que implementen diferentes tecnologias tendrian que implementar esta abstraccion
    List<CallRecord>list=new ArrayList<>();

    public CDRService(){

    }

    public CDRService(ICDRRepository persistOperator) {
        this.cdrRepository = persistOperator;
    }

    public void addCDR(CallRecord callRecord){
        //this.list.add(callRecord);
        cdrRepository.addCallRecord(callRecord);
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

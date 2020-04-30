package Proyecte;

import java.util.ArrayList;
import java.util.List;

public class CDR {

    List<Object>list=new ArrayList<>();

    public CDR() {
    }

    public void addCDR(Object obj){
        list.add(obj);
    }
    public List<Object> getAllCDR(){
        return this.list;
    }
    
}

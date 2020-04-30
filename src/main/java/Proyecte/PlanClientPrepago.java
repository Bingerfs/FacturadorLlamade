package Proyecte;

import java.util.ArrayList;
import java.util.List;

public class PlanClientPrepago implements IPlanClient{

    Client client;
    String phoneNumber;
    String valance;
    String abonos;

    public PlanClientPrepago(Client client, String numberPhone, String valance, String abonos) {
        this.client = client;
        this.phoneNumber = numberPhone;
        this.valance = valance;
        this.abonos = abonos;
    }

    @Override
    public List<Object> getInformationOfClient(){
        List<Object> list=new ArrayList<>();
        list.add(this.client);
        list.add(this.phoneNumber);
        list.add(this.valance);
        list.add(this.abonos);
         return list;
    }

}

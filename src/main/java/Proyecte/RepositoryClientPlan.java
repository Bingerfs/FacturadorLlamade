package Proyecte;

import java.util.ArrayList;
import java.util.List;

public class RepositoryClientPlan {
    static public List<IPlanClient> clientPlans = new ArrayList<>();


    static public void add(IPlanClient plan){
        clientPlans.add(plan);
    }

    static public IPlanClient findByPhoneNumber(String phoneNumber){
        for(IPlanClient plan : clientPlans){
            IPlanClient retrievedPlan = plan.getByPhoneNumber(phoneNumber);
            if(retrievedPlan != null)
                return retrievedPlan;
        }
        return null;
    }

}
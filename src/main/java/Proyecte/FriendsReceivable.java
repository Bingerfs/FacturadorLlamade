package Proyecte;

import java.util.List;

public class FriendsReceivable implements Receivable {

    List<String> friends;

    FriendsReceivable(List<String> friends){
        this.friends = friends;
    }

    @Override
    public Float applyReceivable(Float cost, String endpointNumber) {
        if(friends.contains(endpointNumber))
            cost = (float)0;
        return cost;
    }
    
}
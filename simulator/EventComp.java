package cs2030.simulator;

import java.util.Comparator;

public class EventComp implements Comparator<Event> {
    public int compare(Event a, Event b) {
        

        if (Double.compare(a.getTime(), b.getTime()) == 0) {
            if (a.getCustomer().getID() == b.getCustomer().getID()) {
                return a.toString().compareTo(b.toString());
            } else {
                return a.getCustomer().getID() - b.getCustomer().getID();
            }
        } 
        
        return Double.compare(a.getTime(), b.getTime());
        
    }        
}
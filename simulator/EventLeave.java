package cs2030.simulator;

import java.util.PriorityQueue;

public class EventLeave extends Event {
    
    public EventLeave(double time, Customer customer) {
        super(time, customer);
    }

    public boolean isLastEvent() {
        return true;
    }

    public boolean isLeave() {
        return true;
    }

    public Event nextEvent(Server server) {
        return null;
    }

    public String toString() {
        return super.toString() + " leaves";
    }
}
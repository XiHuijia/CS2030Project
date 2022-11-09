package cs2030.simulator;

import java.util.PriorityQueue;

public class EventRest extends Event {
    private final String nextStatus;

    public EventRest(double time, Customer customer, Server server, String nextStatus) {
        super(time, customer, server);
        this.nextStatus = nextStatus;
    }

    public boolean isRest() {
        return true;
    }

    public boolean isLastEvent() {
        return true;
    }

    public Event nextEvent(Server server) {
        return null;
    }

    public String getNext() {
        return this.nextStatus;
    }

    public String toString() {
        return super.toString() + " resting " + this.getServer();
    }
}
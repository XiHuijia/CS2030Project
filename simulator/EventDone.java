package cs2030.simulator;

import java.util.PriorityQueue;

public class EventDone extends Event {
    public EventDone(double time, Customer customer, Server server) {
        super(time, customer, server);
    }

    public boolean isLastEvent() {
        return true;
    }

    public boolean isDone() {
        return true;
    }

    public Event nextEvent(Server server) {
        return null;
    }

    public String toString() {
        return super.toString() + " done serving by server " + this.getServer();
    }
}
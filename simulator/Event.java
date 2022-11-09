package cs2030.simulator;

import java.util.PriorityQueue;

public abstract class Event {
    private final double time;
    private final Customer customer;
    private final Server server;

    public Event(double time, Customer customer) {
        this.time = time;
        this.customer = customer;
        this.server = null;
    }

    public Event(double time, Customer customer, Server server) {
        this.time = time;
        this.customer = customer;
        this.server = server;
    }

    public double getTime() {
        return this.time;
    }

    public Customer getCustomer() {
        return this.customer;
    }

    public Server getServer() {
        return this.server;
    }

    public abstract Event nextEvent(Server server);

    public boolean isLastEvent() {
        return false;
    }

    public boolean isArrive() {
        return false;
    }

    public boolean isLeave() {
        return false;
    }

    public boolean isWait() {
        return false;
    }

    public boolean isDone() {
        return false;
    }

    public boolean isServe() {
        return false;
    }

    public boolean isRest() {
        return false;
    }

    public String getNext() {
        return null;
    }

    public String toString() {
        return String.format("%.3f %s", this.time, this.customer);
    }
}
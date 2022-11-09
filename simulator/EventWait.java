package cs2030.simulator;

import java.util.PriorityQueue;

import java.util.ArrayList;

public class EventWait extends Event {    
    public EventWait(double time, Customer customer, Server server) {
        super(time, customer, server);
    }

    public boolean isWait() {
        return true;
    }

    public EventServe nextEvent(Server server) {
        ArrayList<Customer> queue = server.getQueue();        
        Server newServer = new Server(server.getId(), "waiting", server.getTime(), 
            server.getNumOfCustomer(), queue);

        return new EventServe(newServer.getTime(), this.getCustomer(), newServer);        
    }

    public String toString() {
        return super.toString() + " waits at server " + this.getServer();
    }
}
package cs2030.simulator;

import java.util.PriorityQueue;

import java.util.ArrayList;

public class EventServe extends Event {    
    public EventServe(double time, Customer customer, Server server) {
        super(time, customer, server);
    }


    public EventDone nextEvent(Server server) {
        ArrayList<Customer> queue = server.getQueue();
        queue.remove(0);

        Server server2 = Server.getServerList(server.getId() - 1);
        double newTime = Math.max(this.getTime() + this.getCustomer().getServiceTime(), 
            server2.getTime());

        Server newServer = new Server(server.getId(), "serving", 
            newTime, server.getNumOfCustomer(), queue);
        //Server.serverList.set(server.getId()-1, newServer);

        return new EventDone(this.getTime() + this.getCustomer().getServiceTime(), 
            this.getCustomer(), newServer);

    }

    public boolean isServe() {
        return true;
    }

    public String toString() {
        return super.toString() + " serves by server " + this.getServer();
    }
}
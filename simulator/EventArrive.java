package cs2030.simulator;

import java.lang.Math;

import java.util.ArrayList;

import java.util.PriorityQueue;

public class EventArrive extends Event {
    public EventArrive(double time, Customer customer) {
        super(time, customer);
    }

    public boolean isArrive() {
        return true;
    }

    public Event nextEvent(Server server) {
        if (server.getStatus().equals("free") 
            && server.getTime() <= this.getTime() 
            && server.getNumOfCustomer() > 0) {
            
            ArrayList<Customer> queue = server.getQueue();
            queue.add(this.getCustomer());
            Server newServer = new Server(server.getId(), "serving", 
                Math.max(server.getTime(), this.getTime()), server.getNumOfCustomer() - 1, queue);
            Server.setServerList(server.getId() - 1, newServer);
            
            return new EventServe(this.getTime(), this.getCustomer(), newServer);
        
        } else if ((server.getStatus().equals("serving") 
            || server.getStatus().equals("rest") || server.getStatus().equals("waiting")
            || ((server.getStatus().equals("free") && server.getTime() > this.getTime()))) 
            && server.getNumOfCustomer() > 0) {

            ArrayList<Customer> queue = server.getQueue();
            queue.add(this.getCustomer());
            
            if (!queue.get(0).equals(this.getCustomer())) {
                int index = queue.indexOf(this.getCustomer());
                Customer customerBefore = queue.get(index - 1);
                double time1 = customerBefore.getServiceTime();
                double time2 = server.getTime();
                Server newServer = new Server(server.getId(), "waiting", time1 + time2, 
                    server.getNumOfCustomer() - 1, queue);

                Server.setServerList(server.getId() - 1, newServer);
                return new EventWait(this.getTime(), this.getCustomer(), newServer);
            } else {
                Server newServer = new Server(server.getId(), "waiting", 
                    server.getTime(), server.getNumOfCustomer() - 1, queue);
                Server.setServerList(server.getId() - 1, newServer);            
                return new EventWait(this.getTime(), this.getCustomer(), newServer);
            }
        } else {
            
            return new EventLeave(this.getTime(), this.getCustomer());
        
        }        
    }

    
    public String toString() {
        return super.toString() + " arrives";
    }
}
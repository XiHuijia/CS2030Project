package cs2030.simulator;

import java.util.ArrayList;

public class Server {
    private final int id;
    private final String status;
    private final double time;
    private final int numOfCustomer;
    private final ArrayList<Customer> customer; //numOfCustomer that this server can serve
    private static final ArrayList<Server> serverList = new ArrayList<Server>();


    public Server(int id, String status, double time, 
        int numOfCustomer, ArrayList<Customer> customer) {
        this.id = id;
        this.status = status;
        this.time = time;
        this.numOfCustomer = numOfCustomer;
        this.customer = customer;
    }

    public int getId() {
        return this.id;
    }

    public String getStatus() {
        return this.status;
    }

    public double getTime() {
        return this.time;
    }

    public int getNumOfCustomer() {
        return this.numOfCustomer;
    }

    public ArrayList<Customer> getQueue() {
        return this.customer;
    }

    public static ArrayList<Server> getServerList() {
        return serverList;
    }

    public static Server getServerList(int index) {
        return serverList.get(index);
    }

    public static void addServerList(Server server) {
        serverList.add(server);
    }

    public static void setServerList(int id, Server server) {
        serverList.set(id, server);
    }

    public boolean equals(Server another) {
        return this.getId() == another.getId() 
            && this.getTime() == another.getTime() 
            && this.getStatus().equals(another.getStatus()) 
            && this.getNumOfCustomer() == another.getNumOfCustomer();
    }

    public String toString() {
        return String.format("%d", this.id);
    }
}
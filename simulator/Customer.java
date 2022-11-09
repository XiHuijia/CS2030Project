package cs2030.simulator;

public class Customer {
    private final int id;
    private final double serviceTime;
    private final boolean greedy;

    public Customer(int id) {
        this.id = id;
        this.serviceTime = 1;
        this.greedy = false;        
    }

    public Customer(int id, double serviceTime) {
        this.id = id;
        this.serviceTime = serviceTime;
        this.greedy = false;
    }

    public Customer(int id, double serviceTime, boolean greedy) {
        this.id = id;
        this.serviceTime = serviceTime;
        this.greedy = greedy;
    }

    public int getID() {
        return this.id;
    }

    public double getServiceTime() {
        return this.serviceTime;
    }

    public boolean getGreedy() {
        return this.greedy;
    }

    public boolean equals(Customer another) {
        return this.getID() == another.getID();
    }

    public String toString() {
        //return String.format("Customer%d, serviceTime %.3f", this.id, this.serviceTime);
        String output = String.format("%d", this.id);
        if (Boolean.TRUE.equals(this.greedy)) {
            output = String.format("%d(greedy)", this.id);
        }
        return output;
    }
    
}
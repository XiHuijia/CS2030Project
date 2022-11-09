package cs2030.simulator;

import java.util.Comparator;

import java.util.PriorityQueue;

import java.util.ArrayList;

import java.util.Queue;

import java.util.LinkedList;

public class Processor {
    public static void process(PriorityQueue<Event> eventQueue, RandomGenerator generator, 
        double probabilityGreedy, int totalCus) {                
        double arrivalTime = 0;
        for (int i = 0; i < totalCus; i++) {
            boolean isGreedy = generator.genCustomerType() < probabilityGreedy;
            Customer customer = new Customer(eventQueue.size() + 1, 0, isGreedy);
            eventQueue.add(new EventArrive(arrivalTime, customer));
            arrivalTime += generator.genInterArrivalTime();
        }
    }
}
    

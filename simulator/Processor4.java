package cs2030.simulator;

import java.util.Comparator;

import java.util.PriorityQueue;

import java.util.ArrayList;

import java.util.Queue;

import java.util.LinkedList;

public class Processor4 {
    public static EventDone process(double eventTime, double serviceTimegenerated, 
        Customer customer, Server newServer) {
        return new EventDone(eventTime + serviceTimegenerated, customer, newServer);        
    }
}

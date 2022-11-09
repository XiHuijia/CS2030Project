package cs2030.simulator;

import java.util.Comparator;

import java.util.PriorityQueue;

import java.util.ArrayList;

import java.util.Queue;

import java.util.LinkedList;

public class Processor2 {
    public static double process(RandomGenerator generator) {
        double serviceTime = generator.genServiceTime();
        return serviceTime;         
    }
}

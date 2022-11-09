package cs2030.simulator;

import java.util.Comparator;

import java.util.PriorityQueue;

import java.util.ArrayList;

import java.util.Queue;

import java.util.LinkedList;

public class CreateGenerator {
    public static RandomGenerator process(int baseSeed, double arrivalRate, 
        double serviceRate, double restingRate) { 
        RandomGenerator generator = new RandomGenerator(baseSeed, arrivalRate, 
            serviceRate, restingRate);
        return generator;
    }
}
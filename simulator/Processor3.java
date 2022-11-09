package cs2030.simulator;

import java.util.Comparator;

import java.util.PriorityQueue;

import java.util.ArrayList;

import java.util.Queue;

import java.util.LinkedList;

public class Processor3 {
    public static boolean process(double probabilityResting, RandomGenerator generator) {
        boolean toRest = generator.genRandomRest() < probabilityResting;
        return toRest;
    }
}
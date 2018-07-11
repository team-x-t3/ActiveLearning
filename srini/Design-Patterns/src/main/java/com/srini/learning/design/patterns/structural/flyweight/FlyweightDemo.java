package com.srini.learning.design.patterns.structural.flyweight;

import com.srini.learning.design.patterns.structural.flyweight.example.InventorySystem;

/**
 * @author - srini91
 * @see <a href="https://srini91.in">blog</a>
 * @see <a href="https://github.com/srinivaschannakeshava">github</a>
 */
public class FlyweightDemo {
    /**
     * Mainly meant for saving memory by sharing data with similar type objects
     * Uses concepts of immutability
     * mainly useful in case of large number of similar objects
     * <p>
     * design uses Factory pattern , compasses creational and structural
     * a lot of core api's utilizes this pattern ex :- string pool in java , All wrapper classes (Integer, Boolean)
     */
    public static void main(String[] args) {

        InventorySystem ims = new InventorySystem();

        ims.takeOrder("Roomba", 1);
        ims.takeOrder("Bose headphone", 12);
        ims.takeOrder("Samsung", 122);
        ims.takeOrder("Boat", 123);
        ims.takeOrder("Jio", 125);
        ims.takeOrder("Jio", 126);
        ims.takeOrder("Jio", 127);
        ims.takeOrder("Roomba", 132);
        ims.takeOrder("Roomba", 212);
        ims.takeOrder("Roomba", 112);
        ims.takeOrder("Roomba", 212);
        ims.process();
        System.out.println(ims.report());
    }
}

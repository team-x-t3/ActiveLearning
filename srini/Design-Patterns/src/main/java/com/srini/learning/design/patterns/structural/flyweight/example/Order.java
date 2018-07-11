package com.srini.learning.design.patterns.structural.flyweight.example;

/**
 * @author - srini91
 * @see <a href="https://srini91.in">blog</a>
 * @see <a href="https://github.com/srinivaschannakeshava">github</a>
 */
public class Order {
    private final int orderNumber;
    private final Item item;

    public Order(int orderNo, Item item) {
        this.orderNumber = orderNo;
        this.item = item;
    }

    void processOrder() {
        System.out.println("Ordering " + item + " for order number " + orderNumber);
    }
}

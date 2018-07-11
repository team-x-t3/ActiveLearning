package com.srini.learning.design.patterns.structural.flyweight.example;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @author - srini91
 * @see <a href="https://srini91.in">blog</a>
 * @see <a href="https://github.com/srinivaschannakeshava">github</a>
 */
public class InventorySystem {
    private final Catalog catalog = new Catalog();
    private final List<Order> orders = new CopyOnWriteArrayList<>();

    public void takeOrder(String itemName, int orderNumber) {
        Item item = catalog.lookUp(itemName);
        Order order = new Order(orderNumber, item);
        orders.add(order);
    }

    public void process() {
        for (Order order : orders) {
            order.processOrder();
            orders.remove(order);
        }
    }

    public String report() {
        return "Total Item Objects made: " + catalog.totalItems();
    }
}

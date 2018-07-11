package com.srini.learning.design.patterns.structural.flyweight.example;

import java.util.HashMap;
import java.util.Map;

/**
 * @author - srini91
 * @see <a href="https://srini91.in">blog</a>
 * @see <a href="https://github.com/srinivaschannakeshava">github</a>
 */
public class Catalog {
    private Map<String, Item> items = new HashMap<>();

    public Item lookUp(String itemName) {
        if (!items.containsKey(itemName)) {
            items.put(itemName, new Item(itemName));
        }
        return items.get(itemName);
    }

    public int totalItems() {
        return items.size();
    }
}

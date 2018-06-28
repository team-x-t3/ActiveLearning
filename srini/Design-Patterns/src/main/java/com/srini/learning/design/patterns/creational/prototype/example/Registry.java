package com.srini.learning.design.patterns.creational.prototype.example;

import java.util.HashMap;
import java.util.Map;

public class Registry {
    private Map<String, Item> items = new HashMap<>();

    public Registry() {
        this.loadItems();
    }

    public Item createItem(Class classObj) {
        Item item = null;
        try {
            item = (Item) (this.items.get(classObj.getName()).clone());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return item;
    }

    private void loadItems() {
        Movie movie = new Movie();
        movie.setTitle("Infinity Wars");
        movie.setPrice(99.99);
        movie.setRuntime("2.5 hours");
        this.items.put(Movie.class.getName(), movie);
        Book book = new Book();
        book.setNumberOfPages(1000);
        book.setPrice(19.99);
        book.setTitle("Inner Engineering");
        this.items.put("Book", book);
    }
}

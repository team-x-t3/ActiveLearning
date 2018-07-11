package com.srini.learning.design.patterns.structural.flyweight.example;

import lombok.Getter;

/**
 * @author - srini91
 * @see <a href="https://srini91.in">blog</a>
 * @see <a href="https://github.com/srinivaschannakeshava">github</a>
 */
@Getter
public class Item {
    private final String name;

    public Item(String name) {
        this.name = name;
    }

}

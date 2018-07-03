package com.srini.learning.design.patterns.structural.decorator.example;

/**
 * @author - srini91
 * @see <a href="https://srini91.in">blog</a>
 * @see <a href="https://github.com/srinivaschannakeshava">github</a>
 */
public class SimpleSandwich implements Sandwich {
    @Override
    public String make() {
        return "Make Simple Sandwich";
    }
}

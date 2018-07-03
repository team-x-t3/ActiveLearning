package com.srini.learning.design.patterns.structural.decorator.example;

/**
 * @author - srini91
 * @see <a href="https://srini91.in">blog</a>
 * @see <a href="https://github.com/srinivaschannakeshava">github</a>
 */
public abstract class SandwichDecorator implements Sandwich {
    protected Sandwich customSandwich;

    public SandwichDecorator(Sandwich sandwich) {
        customSandwich = sandwich;
    }

    @Override
    public String make() {
        return customSandwich.make();
    }
}

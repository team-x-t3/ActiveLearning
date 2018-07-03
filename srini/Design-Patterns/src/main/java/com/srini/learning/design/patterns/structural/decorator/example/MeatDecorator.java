package com.srini.learning.design.patterns.structural.decorator.example;

/**
 * @author - srini91
 * @see <a href="https://srini91.in">blog</a>
 * @see <a href="https://github.com/srinivaschannakeshava">github</a>
 */
public class MeatDecorator extends SandwichDecorator {
    public MeatDecorator(Sandwich sandwich) {
        super(sandwich);
    }

    @Override
    public String make() {
        return customSandwich.make() + addMeat();
    }

    private String addMeat() {
        return "+ Meat";
    }
}

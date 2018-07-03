package com.srini.learning.design.patterns.structural.decorator.example;

/**
 * @author - srini91
 * @see <a href="https://srini91.in">blog</a>
 * @see <a href="https://github.com/srinivaschannakeshava">github</a>
 */
public class CheeseDecorator extends SandwichDecorator {

    public CheeseDecorator(Sandwich sandwich) {
        super(sandwich);
    }

    @Override
    public String make() {
        return super.make() + addCheese();
    }

    private String addCheese() {
        return "+ Cheese";
    }
}

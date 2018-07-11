package com.srini.learning.design.patterns.structural.decorator;

import com.srini.learning.design.patterns.structural.decorator.example.CheeseDecorator;
import com.srini.learning.design.patterns.structural.decorator.example.MeatDecorator;
import com.srini.learning.design.patterns.structural.decorator.example.Sandwich;
import com.srini.learning.design.patterns.structural.decorator.example.SimpleSandwich;

/**
 * @author - srini91
 * @see <a href="https://srini91.in">blog</a>
 * @see <a href="https://github.com/srinivaschannakeshava">github</a>
 */
public class DecoratorPattern {
    /**
     * Decorator pattern is an hierarchical pattern that builds functionality at each level.
     * It uses Composition and inheritance from similar datatypes.
     * - DP is also called as Wrapper pattern
     * - Adds behaviour without affecting others
     * -
     *
     * @param args
     */
    public static void main(String[] args) {
        Sandwich customSandwich = new CheeseDecorator(new MeatDecorator(new SimpleSandwich()));
        System.out.println(customSandwich.make());
    }
}

package com.srini.learning.design.patterns.creational.prototype.example;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public abstract class Item implements Cloneable {
    private String title;
    private double price;
    private String url;


    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

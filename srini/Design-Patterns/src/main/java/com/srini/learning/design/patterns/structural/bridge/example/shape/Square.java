package com.srini.learning.design.patterns.structural.bridge.example.shape;

import com.srini.learning.design.patterns.structural.bridge.example.color.Color;

public class Square extends Shape {

    public Square(Color color) {
        super(color);
    }

    @Override
    public void applyColor() {
        this.color.applyColor();
    }
}

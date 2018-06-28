package com.srini.learning.design.patterns.structural.bridge.example.shape;

import com.srini.learning.design.patterns.structural.bridge.example.color.Color;

public class Circle extends Shape {
    public Circle(Color color) {
        super(color);
    }

    @Override
    public void applyColor() {
        this.color.applyColor();
    }
}

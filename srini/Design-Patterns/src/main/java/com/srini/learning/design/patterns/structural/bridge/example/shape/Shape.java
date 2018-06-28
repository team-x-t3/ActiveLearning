package com.srini.learning.design.patterns.structural.bridge.example.shape;

import com.srini.learning.design.patterns.structural.bridge.example.color.Color;

public abstract class Shape {
    protected Color color;

    public Shape(Color color) {
        this.color = color;
    }

    public abstract void applyColor();
}

package com.srini.learning.design.patterns.structural.bridge.example.color;

public class Red implements Color {
    @Override
    public void applyColor() {
        System.out.println("Applying RED color");
    }
}

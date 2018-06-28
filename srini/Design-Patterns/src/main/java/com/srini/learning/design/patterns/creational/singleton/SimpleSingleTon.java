package com.srini.learning.design.patterns.creational.singleton;

public class SimpleSingleTon {
    private static SimpleSingleTon instance = new SimpleSingleTon();

    private SimpleSingleTon() {
    }

    public static SimpleSingleTon getInstance() {
        return instance;
    }
}

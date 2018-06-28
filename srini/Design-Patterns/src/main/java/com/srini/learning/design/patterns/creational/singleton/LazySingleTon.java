package com.srini.learning.design.patterns.creational.singleton;

public class LazySingleTon {
    private static LazySingleTon instance = null;

    private LazySingleTon() {
    }

    public static LazySingleTon getInstance() {
        //lazy loading - create only if required
        if (instance == null) {
            instance = new LazySingleTon();
        }
        return instance;
    }
}

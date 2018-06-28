package com.srini.learning.design.patterns.creational.singleton;

public class ThreadSafeSingleTon {
    //volatile to keep instance updated
    private static volatile ThreadSafeSingleTon instance = null;

    private ThreadSafeSingleTon() {
        if (instance != null) {
            //Prevent using reflection for creating object
            throw new RuntimeException("Use getInstance() method to create");
        }
    }

    public static ThreadSafeSingleTon getInstance() {
        //Lazy loading
        if (instance == null) {
            synchronized (ThreadSafeSingleTon.class) {
                if (instance == null) {
                    instance = new ThreadSafeSingleTon();
                }
            }
        }
        return instance;
    }
}

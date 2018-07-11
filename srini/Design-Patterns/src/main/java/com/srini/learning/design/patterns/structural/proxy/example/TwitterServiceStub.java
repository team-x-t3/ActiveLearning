package com.srini.learning.design.patterns.structural.proxy.example;

/**
 * @author - srini91
 * @see <a href="https://srini91.in">blog</a>
 * @see <a href="https://github.com/srinivaschannakeshava">github</a>
 */
public class TwitterServiceStub implements TwitterService {
    @Override
    public String getTimeline(String name) {
        return "Srinivas Timeline : " + name;
    }

    @Override
    public void postToTimeline(String name, String message) {
        System.out.println("Posted on Srinivas Timeline");
    }
}

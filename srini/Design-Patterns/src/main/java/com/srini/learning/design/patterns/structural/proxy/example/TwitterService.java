package com.srini.learning.design.patterns.structural.proxy.example;

/**
 * @author - srini91
 * @see <a href="https://srini91.in">blog</a>
 * @see <a href="https://github.com/srinivaschannakeshava">github</a>
 */
public interface TwitterService {

    String getTimeline(String name);

    void postToTimeline(String name, String message);
}

package com.srini.learning.design.patterns.structural.proxy;

import com.srini.learning.design.patterns.structural.proxy.example.SecurityProxy;
import com.srini.learning.design.patterns.structural.proxy.example.TwitterService;
import com.srini.learning.design.patterns.structural.proxy.example.TwitterServiceStub;

/**
 * @author - srini91
 * @see <a href="https://srini91.in">blog</a>
 * @see <a href="https://github.com/srinivaschannakeshava">github</a>
 */
public class ProxyDemo {
    /**
     * Acts as an interface to something else.
     * Adds functionality
     * Proxy used to access real object
     * AOP is completely base on this pattern
     */
    public static void main(String[] args) {
        TwitterService serv = (TwitterService) SecurityProxy.newInstance(new TwitterServiceStub());
        System.out.println(serv.getTimeline("Srini"));
    }
}

package com.srini.learning.design.patterns.creational.factory;

import com.srini.learning.design.patterns.creational.factory.example.WebsiteFactory;
import com.srini.learning.design.patterns.creational.factory.example.website.WebSite;
import com.srini.learning.design.patterns.creational.factory.example.website.WebsiteType;

public class FactoryDemo {
    public static void main(String[] args) {
        WebSite site = WebsiteFactory.getWebsite(WebsiteType.BLOG);
        System.out.println(site.getPages());
        site = WebsiteFactory.getWebsite(WebsiteType.SHOP);
        System.out.println(site.getPages());

    }
}

package com.srini.learning.design.patterns.creational.factory.example;

import com.srini.learning.design.patterns.creational.factory.example.website.Blog;
import com.srini.learning.design.patterns.creational.factory.example.website.Shop;
import com.srini.learning.design.patterns.creational.factory.example.website.WebSite;
import com.srini.learning.design.patterns.creational.factory.example.website.WebsiteType;

public class WebsiteFactory {
    public static WebSite getWebsite(WebsiteType type) {
        switch (type) {
            case BLOG: {
                return new Blog();
            }
            case SHOP: {
                return new Shop();
            }
            default: {
                return null;
            }
        }
    }
}

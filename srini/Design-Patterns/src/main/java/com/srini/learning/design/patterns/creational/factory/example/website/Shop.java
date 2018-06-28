package com.srini.learning.design.patterns.creational.factory.example.website;

import com.srini.learning.design.patterns.creational.factory.example.pages.CartPage;
import com.srini.learning.design.patterns.creational.factory.example.pages.CommentPage;
import com.srini.learning.design.patterns.creational.factory.example.pages.SearchPage;

public class Shop extends WebSite {
    @Override
    public void createWebSite() {
        this.pages.add(new CartPage());
        this.pages.add(new SearchPage());
        this.pages.add(new CommentPage());
    }
}

package com.srini.learning.design.patterns.creational.factory.example.website;

import com.srini.learning.design.patterns.creational.factory.example.pages.CommentPage;
import com.srini.learning.design.patterns.creational.factory.example.pages.ContactPage;
import com.srini.learning.design.patterns.creational.factory.example.pages.PostPage;

public class Blog extends WebSite {
    @Override
    public void createWebSite() {
        this.pages.add(new PostPage());
        this.pages.add(new CommentPage());
        this.pages.add(new ContactPage());
    }
}

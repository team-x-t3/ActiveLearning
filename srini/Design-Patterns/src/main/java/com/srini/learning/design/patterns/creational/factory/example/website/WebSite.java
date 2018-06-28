package com.srini.learning.design.patterns.creational.factory.example.website;

import com.srini.learning.design.patterns.creational.factory.example.pages.Page;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public abstract class WebSite {
    protected List<Page> pages = new ArrayList<>();

    public WebSite() {
        this.createWebSite();
    }

    public abstract void createWebSite();
}

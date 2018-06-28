package com.srini.learning.design.patterns.structural.composite.example;

public class Menu extends MenuComponent {
    public Menu(String name, String url) {
        this.name = name;
        this.url = url;
    }

    public MenuComponent add(MenuComponent mComp) {
        this.menuComponents.add(mComp);
        return mComp;
    }

    public MenuComponent remove(MenuComponent mComp) {
        this.menuComponents.remove(mComp);
        return mComp;
    }


    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(this.print());
        for (MenuComponent mComp : this.menuComponents) {
            builder.append(mComp.toString());
        }
        return builder.toString();
    }
}

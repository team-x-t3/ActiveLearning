package com.srini.learning.design.patterns.structural.composite.example;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

public abstract class MenuComponent {
    @Getter
    String name;
    @Getter
    String url;
    List<MenuComponent> menuComponents = new ArrayList<>();

    @Override
    public abstract String toString();

    public MenuComponent add(MenuComponent menuComponent) {
        throw new UnsupportedOperationException("Feature not implemented at this level");
    }

    public MenuComponent remove(MenuComponent menuComponent) {
        throw new UnsupportedOperationException("Feature not implemented at this level");
    }

    public String print() {
        StringBuilder builder = new StringBuilder(this.name);
        builder.append(": ");
        builder.append(this.url);
        builder.append("\n");
        return builder.toString();
    }
}

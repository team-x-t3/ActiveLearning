package com.srini.learning.design.patterns.structural.composite;

import com.srini.learning.design.patterns.structural.composite.example.Menu;
import com.srini.learning.design.patterns.structural.composite.example.MenuItem;

public class CompositePatternDemo {
    public static void main(String[] args) {
        Menu mainMenu = new Menu("Main", "/main");
        MenuItem safetyMenuItem = new MenuItem("Safety", "/safety");
        mainMenu.add(safetyMenuItem);
        Menu claimSubMenu = new Menu("Claims", "/claims");
        mainMenu.add(claimSubMenu);
        MenuItem personalClaimsMenu = new MenuItem("Personal Claim", "/personalClaims");
        try {
            personalClaimsMenu.add(new MenuItem("testingUnsupported", "/unsupported"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        claimSubMenu.add(personalClaimsMenu);
        System.out.println(mainMenu.toString());

    }
}

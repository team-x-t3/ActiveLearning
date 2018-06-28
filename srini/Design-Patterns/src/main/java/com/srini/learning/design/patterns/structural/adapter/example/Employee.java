package com.srini.learning.design.patterns.structural.adapter.example;

public interface Employee {
    String getId();

    String getFirstName();

    String getLastName();

    String getEmail();

    default String getString() {
        return "ID : " + this.getId() + " FirstName : " + this.getFirstName() + " LastName : " + this.getLastName() + " Email : " + this.getEmail();
    }
}

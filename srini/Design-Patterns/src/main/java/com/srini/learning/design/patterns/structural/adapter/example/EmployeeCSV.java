package com.srini.learning.design.patterns.structural.adapter.example;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmployeeCSV {
    private int id;
    private String firstName;
    private String lastName;
    private String emailId;

    public EmployeeCSV(String values) {
        String[] split = values.split(",");
        this.id = Integer.parseInt(split[0]);
        this.firstName = split[1];
        this.lastName = split[2];
        this.emailId = split[3];
    }
}

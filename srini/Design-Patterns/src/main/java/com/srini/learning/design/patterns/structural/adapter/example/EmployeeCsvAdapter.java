package com.srini.learning.design.patterns.structural.adapter.example;

public class EmployeeCsvAdapter implements Employee {
    private EmployeeCSV instance;

    public EmployeeCsvAdapter(EmployeeCSV empCsv) {
        this.instance = empCsv;
    }

    @Override
    public String getId() {
        return this.instance.getId() + "";
    }

    @Override
    public String getFirstName() {
        return this.instance.getFirstName();
    }

    @Override
    public String getLastName() {
        return this.instance.getLastName();
    }

    @Override
    public String getEmail() {
        return this.instance.getEmailId();
    }
}

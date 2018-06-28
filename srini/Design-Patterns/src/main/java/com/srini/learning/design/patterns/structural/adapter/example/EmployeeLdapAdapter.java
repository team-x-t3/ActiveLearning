package com.srini.learning.design.patterns.structural.adapter.example;

public class EmployeeLdapAdapter implements Employee {
    private EmployeeLdap instance;

    public EmployeeLdapAdapter(EmployeeLdap instance) {
        this.instance = instance;
    }

    @Override
    public String getId() {
        return this.instance.getCn();
    }

    @Override
    public String getFirstName() {
        return this.instance.getSurName();
    }

    @Override
    public String getLastName() {
        return this.instance.getGivenName();
    }

    @Override
    public String getEmail() {
        return this.instance.getMail();
    }
}

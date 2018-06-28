package com.srini.learning.design.patterns.structural.adapter.example;

import java.util.ArrayList;
import java.util.List;

public class EmployeeClient {
    public List<Employee> getEmployeeList() {
        List<Employee> employees = new ArrayList<>();
        Employee dbEmployee = new EmployeeDB("30790831", "Srinivas", "Channakeshava", "srinivas@gmail.com");
        employees.add(dbEmployee);
        EmployeeLdap ldapEmployee = new EmployeeLdap("30790832", "Channakeshava", "Srinivas", "ch@gmail.com");
        employees.add(new EmployeeLdapAdapter(ldapEmployee));
        EmployeeCSV csvEmployee = new EmployeeCSV("30790833,Channakeshava, kavya, chk@gmail.com");
        employees.add(new EmployeeCsvAdapter(csvEmployee));
        return employees;
    }

}

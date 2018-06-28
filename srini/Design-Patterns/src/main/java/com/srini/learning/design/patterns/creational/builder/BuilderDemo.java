package com.srini.learning.design.patterns.creational.builder;

public class BuilderDemo {
    public static void main(String[] args) {
        Employee.Builder builder = new Employee.Builder();
        builder.name("srinivas").office("RBEI").dob("09/11/1991").salary(9).address("Spalya");
        System.out.println(builder.build());

    }
}

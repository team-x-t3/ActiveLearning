package com.srini.learning.design.patterns.creational.builder;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public final class Employee {
    private Employee() {
    }

    public static class Builder {
        private String name;
        private String dob;
        private String address;
        private int salary;
        private String office;
        private String officeLoc;

        public Builder() {

        }

        public Employee build() {
            return new Employee(this);
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder dob(String dob) {
            this.dob = dob;
            return this;
        }

        public Builder address(String address) {
            this.address = address;
            return this;
        }

        public Builder salary(int salary) {
            this.salary = salary;
            return this;
        }

        public Builder office(String office) {
            this.office = office;
            return this;
        }

        public Builder officeLoc(String officeLoc) {
            this.officeLoc = officeLoc;
            return this;
        }
    }

    private String name;
    private String dob;
    private String address;
    private int salary;
    private String office;
    private String officeLoc;

    private Employee(Builder builder) {
        this.name = builder.name;
        this.dob = builder.dob;
        this.address = builder.address;
        this.salary = builder.salary;
        this.office = builder.office;
        this.officeLoc = builder.officeLoc;
    }
}

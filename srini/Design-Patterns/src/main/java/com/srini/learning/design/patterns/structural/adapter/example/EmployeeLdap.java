package com.srini.learning.design.patterns.structural.adapter.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class EmployeeLdap {
    private String cn;
    private String surName;
    private String givenName;
    private String mail;

}

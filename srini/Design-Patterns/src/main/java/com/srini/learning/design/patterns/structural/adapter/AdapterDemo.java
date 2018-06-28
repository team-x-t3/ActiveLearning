package com.srini.learning.design.patterns.structural.adapter;

import com.srini.learning.design.patterns.structural.adapter.example.EmployeeClient;

import java.util.IntSummaryStatistics;

public class AdapterDemo {
    public static void main(String[] args) {
        EmployeeClient client = new EmployeeClient();
        client.getEmployeeList().forEach(employee -> System.out.println(employee.getString()));
        IntSummaryStatistics intSummaryStatistics = client.getEmployeeList().parallelStream().mapToInt(employee -> Integer.parseInt(employee.getId())).summaryStatistics();
        System.out.println("Max ID : " + intSummaryStatistics.getMax() + " Min ID :" + intSummaryStatistics.getMin());
    }
}

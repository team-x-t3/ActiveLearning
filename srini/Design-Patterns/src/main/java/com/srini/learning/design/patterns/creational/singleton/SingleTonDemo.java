package com.srini.learning.design.patterns.creational.singleton;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SingleTonDemo {
    public static void main(String[] args) throws SQLException {
        SimpleSingleTonExample();
        TSSExample();
        DBConnectionExample();

    }

    private static void DBConnectionExample() throws SQLException {
        long timeBefore = System.currentTimeMillis();
        DBConnector db = DBConnector.getInstance();
        Connection conn = db.getConn();
        long timeAfter = System.currentTimeMillis();
        System.out.println("Initial connection time : " + (timeAfter - timeBefore));
        ResultSet rs = conn.prepareStatement("SELECT * from PERSON").executeQuery();
        while (rs.next()) {
            System.out.println("Id " + rs.getInt("id") + " Name " + rs.getString("name"));
        }
        conn.commit();
        conn.close();
        timeBefore = System.currentTimeMillis();
        DBConnector db2 = DBConnector.getInstance();
        Connection conn2 = db.getConn();
        timeAfter = System.currentTimeMillis();
        System.out.println("Second connection time : " + (timeAfter - timeBefore));
    }

    private static void TSSExample() {
        ThreadSafeSingleTon tss = ThreadSafeSingleTon.getInstance();
        System.out.println(tss);
        ThreadSafeSingleTon tss2 = ThreadSafeSingleTon.getInstance();
        System.out.println(tss2);
    }

    private static void SimpleSingleTonExample() {
        SimpleSingleTon instance = SimpleSingleTon.getInstance();
        System.out.println(instance);
        SimpleSingleTon instance2 = SimpleSingleTon.getInstance();
        System.out.println(instance2);
        if (instance == instance2)
            System.out.println("Both are one and the same");
    }
}

package com.srini.learning.design.patterns.creational.singleton;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnector {
    private static volatile DBConnector instance = null;
    private static volatile Connection conn = null;

    private DBConnector() {
        if (instance != null) {
            throw new RuntimeException("Use get instance for creating DBConnection");
        }
    }

    public static DBConnector getInstance() {
        if (instance == null) {
            synchronized (DBConnector.class) {
                if (instance == null) {
                    instance = new DBConnector();
                }
            }
        }
        return instance;
    }

    public Connection getConn() {
        if (conn == null) {
            synchronized (DBConnector.class) {
                if (conn == null) {
                    try {
                        conn = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
                        Class.forName("org.h2.Driver");
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        return conn;
    }

}

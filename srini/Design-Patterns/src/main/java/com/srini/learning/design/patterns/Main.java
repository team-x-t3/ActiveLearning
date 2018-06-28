package com.srini.learning.design.patterns;

import java.sql.*;

public class Main {
    public static void main(String[] args) {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
            Class.forName("org.h2.Driver");
            PreparedStatement stm = conn.prepareStatement("CREATE TABLE PERSON(ID int primary key, NAME varchar(255))");
            stm.executeUpdate();
            stm = conn.prepareStatement("INSERT INTO PERSON(id, name) VALUES(1, 'Srini')");
            stm.executeUpdate();
            stm = conn.prepareStatement("INSERT INTO PERSON(id, name) VALUES(3, 'Raju')");
            stm.executeUpdate();
            stm = conn.prepareStatement("INSERT INTO PERSON(id, name) VALUES(2, 'Ujwal')");
            stm.executeUpdate();
            stm = conn.prepareStatement("SELECT * from PERSON");
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                System.out.println("Id " + rs.getInt("id") + " Name " + rs.getString("name"));
            }
            stm.close();
            conn.commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }
    }

}

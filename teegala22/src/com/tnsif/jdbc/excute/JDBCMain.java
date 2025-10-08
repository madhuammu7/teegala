package com.tnsif.jdbc.excute;


import java.sql.*;

public class CurdOperations {

    private static final String URL = "jdbc:mysql://localhost:3306/teegala";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";

    public static void addStudent(int id, String name) {
        String query = "INSERT INTO students (id, name) VALUES (?, ?)";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, id);
            ps.setString(2, name);

            int rows = ps.executeUpdate();
            if (rows > 0) {
                System.out.println("Student added: " + name);
            }

            ps.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

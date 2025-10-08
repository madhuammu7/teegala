package com.tnsif.jdbc.dao;



    private static Connection con;
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";
    private static final String URL = "jdbc:mysql://localhost:3306/teegala";

    public static Connection getConnection() {
        try {
            Class.forName(DRIVER);
            System.out.println("Driver loaded successfully");

            con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            System.out.println("Connection established");

        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }

    public static void main(String[] args) {
        getConnection();
    }


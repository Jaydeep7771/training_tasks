package com.jaydeep.project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DBconfig {
    public static Connection getConnection(){
        String driver="com.mysql.cj.jdbc.Driver";
        String url="jdbc:mysql://localhost:3306/mindsprint";
        String username="root";
        String password="admin123";
        Connection con = null;
        try {
            Class.forName(driver);
            con = DriverManager.getConnection(url,username,password);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }
}

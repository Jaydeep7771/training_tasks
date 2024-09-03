package com.jaydeep.jdbc.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLDataException;
import java.sql.Statement;

public class Connect {
    public static void main(String[] args) {
        String driver="com.mysql.cj.jdbc.Driver";
        String url="jdbc:mysql://localhost:3306/mindsprint";
        String username="root";
        String password="admin123";

        try {
            Class.forName(driver);
            Connection con = DriverManager.getConnection(url,username,password);
            if(con!=null){
                System.out.println("established");
                String sql="create table IF NOT EXISTS employee(id INT primary key auto_increment,"+
                        "name varchar(100),email varchar(20))";
                Statement stmt =con.createStatement();
                stmt.execute(sql);
                System.out.println("table creted");
            }
            else{
                System.out.println("error");
            }
        } catch (Exception e) {
           e.printStackTrace();
        }

    }
}

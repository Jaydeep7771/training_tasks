package com.jaydeep.project;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class Callable {
    public static void main(String[] args) {
        String driver="com.mysql.cj.jdbc.Driver";
        String url="jdbc:mysql://localhost:3306/task";
        String username="root";
        String password="admin123";

        try{
            Class.forName(driver);
            Connection cn = DriverManager.getConnection(url,username,password);
            CallableStatement stmt= cn.prepareCall("call getAllAcoounts ");
            ResultSet set = stmt.executeQuery();
            while (set.next()){
                System.out.println(set.getString(1)+""+set.getString(2)+""+set.getDouble(3));
            }

        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}

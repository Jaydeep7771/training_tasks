package com.jaydeep.project;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;

public class DBMetaData {
    public static void main(String[] args) {
        try(Connection cn= DBconfig.getConnection()){
            DatabaseMetaData dbmd =cn.getMetaData();
            System.out.println(dbmd.getUserName());
            ResultSet set = dbmd.getCatalogs();
            while (set.next()){
                System.out.println(set.getString(1));
            }

        }
        catch (Exception e){
            e.printStackTrace();

        }
    }
}

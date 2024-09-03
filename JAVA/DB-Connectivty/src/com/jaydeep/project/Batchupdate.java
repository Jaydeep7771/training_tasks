package com.jaydeep.project;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Batchupdate {
    public static void main(String[] args) {
        try(Connection con = DBconfig.getConnection();
            Scanner sc = new Scanner(System.in)){
            String sql="insert into employee (name,email) values(?,?)";
            PreparedStatement pst = con.prepareStatement(sql);

            while(true){
                System.out.println("Enter name");
                String name = sc.nextLine();
                System.out.println("Enter email");
                String email=sc.nextLine();
                pst.setString(1,name);
                pst.setString(2,email);
                pst.addBatch();
                System.out.println("Enter 1 to exit");
                if (sc.nextLine().equals("1")) break;



            }
            int [] records= pst.executeBatch();
            System.out.println(records.length+"records inserted in DB");

        }
        catch (Exception e){
            e.printStackTrace();

        }
    }
}

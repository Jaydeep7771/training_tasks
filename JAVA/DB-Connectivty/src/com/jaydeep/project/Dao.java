package com.jaydeep.project;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

public class Dao implements EmployeeDAO{
    @Override
    public int addEmployee(Employee employee) {
        int result =0;

       try(Connection con = DBconfig.getConnection();){
           String sql="Insert into employee(name,email) values (?,?)";
           PreparedStatement pst = con.prepareStatement(sql);
           pst.setString(1,employee.getName());
           pst.setString(2,employee.getEmail());
           result= pst.executeUpdate();

       }
       catch (Exception e){
           e.printStackTrace();
       }
       return result;
    }

    @Override
    public void getAllEmployee() {
//        return List.of();
        try(Connection con = DBconfig.getConnection();){
            String sql="Select * from employee";
            Statement stmt = con.createStatement();
            ResultSet set=stmt.executeQuery(sql);
            while (set.next()){
                System.out.println(set.getInt(1)+""+set.getString(2)+""+set.getString(3));
            }


        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void deleteEmployee(int id) {
        try(Connection con = DBconfig.getConnection();){
            String sql="Delete from employee where id=?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1,id);
            if(pst.executeUpdate()>0){
                System.out.println("deleted");
            }
            else {
                System.out.println("not found");
            }


        }
        catch (Exception e){
            e.printStackTrace();
        }


    }

    @Override
    public void updateEmployee(int id , String name) {
        try(Connection con = DBconfig.getConnection();){
            String sql="Update employee set name=? where id=?";
            PreparedStatement pst = con.prepareStatement(sql);

            pst.setString(1,name);
            pst.setInt(2,id);
            if(pst.executeUpdate()>0){
                System.out.println("USER UPDATED");
            }
            else {
                System.out.println("NOT UPDATED");
            }

        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}

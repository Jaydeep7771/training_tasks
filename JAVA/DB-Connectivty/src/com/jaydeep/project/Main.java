package com.jaydeep.project;

public class Main {
    public static void main(String[] args) {
        EmployeeDAO dao = new Dao();
        Employee emp= new Employee("jaydeep","man@gmail.com");
//        if (dao.addEmployee(emp)>0)
//            System.out.println("added");
//        else
//            System.out.println("error");
//        dao.getAllEmployee();
//        dao.deleteEmployee(1);
        dao.updateEmployee(2,"harsh");
    }
}

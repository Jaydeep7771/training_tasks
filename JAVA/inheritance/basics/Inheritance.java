package com.jaydeep.inheritance.basics;

class Person{
    int id;
    String name;
    Person(int id, String name){
        this.id=id;
        this.name=name;
    }
    public void displayMethod(){
        System.out.println("id"+id+"name"+name);
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

class Employee extends Person{
    int empCode;
    String dept;
    public Employee(int id ,String name , int empCode,String dept){
        super(id,name);
        this.empCode=empCode;
        this.dept=dept;

    }

    @Override
    public void displayMethod() {
        super.displayMethod();
        System.out.println("emp code"+empCode+"dept"+dept);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empCode=" + empCode +
                ", dept='" + dept + '\'' +
                ", id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}


public class Inheritance {
    public static void main(String[] args) {
        Employee e1 = new Employee(1,"jaydeep",78,"HR");
        /*e1.displayMethod();*/
        System.out.println(e1);

    }
}

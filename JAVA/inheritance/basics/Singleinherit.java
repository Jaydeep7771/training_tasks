package com.jaydeep.inheritance.basics;

class Parent{
    Parent(){
        System.out.println("Parent class");
    }

}
class Child extends Parent{
    Child(){
        System.out.println("Child class");

    }
}

public class Singleinherit {
    public static void main(String[] args) {
        Child c = new Child();

    }
}

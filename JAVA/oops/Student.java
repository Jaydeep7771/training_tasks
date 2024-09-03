package com.jaydeep.oops;

public class Student {
//    String name="Jaydeep";
    int id;
    String name;
    String email;
    String country;

        public void setData(int id , String name,String email, String country){
            this.id=id;
            this.name=name;
            this.email=email;
            this.country=country;
        }
        public void display(){
            System.out.println(id);
            System.out.println(name);
            System.out.println(email);
            System.out.println(country);
        }
    public static void main(String[] args) {
//        Student obj1= new Student();
//        Student obj2= new Student();
//        System.out.println(obj1.name);
//        System.out.println(obj2.name);
        Student s1 = new Student();
        s1.setData(1,"hello","hello@gmail.com","india");

    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}


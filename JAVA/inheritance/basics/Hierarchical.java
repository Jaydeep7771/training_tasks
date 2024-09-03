package com.jaydeep.inheritance.basics;

 class Account {
     String acc_no;
    String name ;
    double balance;
    public Account(String acc_no, String name, double balance){
        this.acc_no=acc_no;
        this.name=name;
        this.balance=balance;
    }
    public void deposit(double amount) {

        balance += amount;
    }
    public void withdraw(double amount) {

        if (balance >= amount) {

            balance -= amount;
        } else {

            System.out.println("Insufficient balance");
        }

}
    public double getBalance() {
        System.out.println(balance);
        return balance;
    }
}

 class SavingsAccount extends Account{
     int intrest;

    public SavingsAccount( String name ,String acc_no, double balance) {

        super(name,acc_no, balance);
        intrest=9;
    }
    public void calcIntAmnt(){
        System.out.println("BALANCE"+balance*intrest);
    }

}
class CurrentAccount extends Account{
    public CurrentAccount( String name ,String acc_no, double balance) {

        super(name,acc_no, balance);
    }
    public void withdraw(double amount) {

        if (getBalance() - amount < 100) {

            System.out.println("Minimum balance of $100 required!");
        } else {

            super.withdraw(amount);
        }
    }
}
public class Hierarchical {
    public static void main(String[] args) {
    Account acc = new Account("acc11","Jaydepep",100);
    acc.deposit(100);
    acc.getBalance();


    SavingsAccount asc = new SavingsAccount("jaydeep","acc11",8000);
    asc.calcIntAmnt();
    asc.getBalance();

    CurrentAccount csc= new CurrentAccount("jaydeep","acc11",1000);
    csc.withdraw(100);
    csc.getBalance();
    }
}


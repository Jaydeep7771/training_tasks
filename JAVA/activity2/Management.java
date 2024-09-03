package com.jaydeep.activity2;

public class Management {
    public static void main(String[] args) {
        Product p1 = new Product("phone",1,100000);
        Product p2 = new Product("head-phone",2,200000);
        Product p3 = new Product("smart-phone",3,300000);

        Inventory inv = new Inventory();
        inv.addProduct(p1);
        inv.addProduct(p2);
        inv.addProduct(p3);
        inv.displayProducts();

        inv.removeProducts(1);
        inv.displayProducts();
    }
}

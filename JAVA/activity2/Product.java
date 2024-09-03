package com.jaydeep.activity2;

public class Product {
    String name ;
    int produtid;
    double price;

    public Product(String name, int produtid, double price) {
        this.name = name;
        this.produtid = produtid;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getProdutid() {
        return produtid;
    }

    public void setProdutid(int produtid) {
        this.produtid = produtid;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", produtid=" + produtid +
                ", price=" + price +
                '}';
    }
}


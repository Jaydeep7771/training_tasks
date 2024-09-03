package com.jaydeep.activity2;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
  List<Product> products;

  public Inventory(){
      products = new ArrayList<>();
  }

  public void addProduct(Product product){
      products.add(product);
      System.out.println("Product added sucessfully !");
  }
  public void removeProducts(int id){
      for (Product p : products){
          {
              if (p.getProdutid()==id)
                  products.remove(p);
              break;
          }

      }
      System.out.println(products);


  }
  public void displayProducts(){
      System.out.println("Inventory");
      for (Product product : products) {
          System.out.println("Name: " + product.getName());
          System.out.println("id"+product.getProdutid());
          System.out.println("price"+product.getPrice());
          System.out.println("-----------------------");
      }

  }
  public void searchProducts(String name ){
      System.out.println("Searching Prodcuts");

  }

}

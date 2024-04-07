package edu.galley.grub;

import java.util.ArrayList;

public class Order implements Comanda {
    private Double total;
    private ArrayList<Product> products = new ArrayList<>();

    public Order() {
    //No
    }

    @Override
    public void addItem(String name, Double price){
        products.add(new Item(name,price));
    }

    @Override
    public void display(){
        System.out.println(this.toString());
    }

    @Override
    public String toString(){
        StringBuilder display = new StringBuilder("--- ORDER --- \n");
        for (Product product : this.products){
            display.append(product.toString())
            .append("\n");
        }
        return display.toString();
    }
    
}

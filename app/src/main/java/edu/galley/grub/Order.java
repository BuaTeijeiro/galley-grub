package edu.galley.grub;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Order implements Comanda {
    private Double total;
    private ArrayList<Product> products = new ArrayList<>();

    public Order() {
    //No
    }

    @Override
    public void addItem(String name, Double price){
        products.add(ItemFactory.getItem(name, price));
    }
    
    @Override
    public void addItem(String name, Double price, String extra){
        products.add(ItemFactory.getItem(name, price, extra));
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

    public List<Product> itemList(){
        return this.products;
    }

    public Double getTotal(){
        return this.total;
    }

    private Double computeTotal(){
        Optional<Double> sum = this.itemList().stream().map(a -> a.priceWithExtra()).reduce((subtotal, element) -> subtotal + element);
        return sum.isPresent()? sum.get() : 0;
    }

    public void updateTotal(){
        this.total = this.computeTotal();
    }
    
}

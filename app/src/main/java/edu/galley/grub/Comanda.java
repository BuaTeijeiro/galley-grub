package edu.galley.grub;

import java.util.List;

public interface Comanda {

    void addItem(String name, Double price);

    void display();

    List<Product> itemList();

    Double getTotal();

    void updateTotal();

}
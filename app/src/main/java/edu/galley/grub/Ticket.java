package edu.galley.grub;

public interface Ticket {

    Comanda getOrder();

    Double total();

    void print();

}
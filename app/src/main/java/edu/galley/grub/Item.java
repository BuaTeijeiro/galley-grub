package edu.galley.grub;

public class Item implements Product {
    private String name;
    private Double price;
    private String extra;

    public Item(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String name() {
        return name;
    }

    @Override
    public Double price() {
        return price;
    }

    @Override
    public String extra() {
        return extra;
    }

    @Override
    public String toString(){
        return new StringBuilder(this.name)
        .append("....")
        .append(this.price())
        .append("$")
        .toString();
    }
}

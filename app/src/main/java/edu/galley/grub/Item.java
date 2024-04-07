package edu.galley.grub;

public class Item implements Product {
    private String name;
    private Double price;
    private String extra = "";

    public Item(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public Item(String name, Double price, String extra) {
        this.name = name;
        this.price = price;
        this.extra = extra;
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
        StringBuilder display = new StringBuilder(this.name);
        if (!this.extra().equals("")){
            display.append(" w/ ")
            .append(this.extra());
        }
        display.append("....")
        .append(this.price())
        .append("$");
        if (!this.extra().equals("")){
            display.append(" + ")
            .append(RetailPrice.getPrice(this.extra()))
            .append("$");
        }
        return display.toString();
    }
}

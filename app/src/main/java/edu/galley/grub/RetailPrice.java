package edu.galley.grub;

import java.util.HashMap;
import java.util.Map;

public class RetailPrice {
    private static HashMap<String,Double> price = new HashMap<>();

    public static void init_prices(){
        price.put("cheese", 0.25);
        price.put("sauce", 0.5);
        price.put("medium", 0.25);
        price.put("large", 0.5);
    }

    public static void display() {
        System.out.println(RetailPrice.makeString());
    }

    private static String makeString(){
        StringBuilder display = new StringBuilder();
        for(Map.Entry<String,Double> element : RetailPrice.getPrices().entrySet()){
            display.append(element.getKey())
            .append("=")
            .append(element.getValue())
            .append("\n");
        }
        return display.toString();
    }

    private static HashMap<String,Double> getPrices(){
        return RetailPrice.price;
    }

    public static Double getPrice(String product){
        return RetailPrice.contains(product) ? RetailPrice.getPrices().get(product) : 0;
    }

    public static boolean contains(String product){
        return RetailPrice.getPrices().containsKey(product);
    }

}

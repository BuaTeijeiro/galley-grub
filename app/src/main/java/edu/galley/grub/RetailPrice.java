package edu.galley.grub;

import java.util.HashMap;

public class RetailPrice {
    private static HashMap<String,Double> price = new HashMap<>();

    public static void init_prices(){
        price.put("cheese", 0.25);
        price.put("sauce", 0.5);
        price.put("medium", 0.25);
        price.put("large", 0.5);
    }

}

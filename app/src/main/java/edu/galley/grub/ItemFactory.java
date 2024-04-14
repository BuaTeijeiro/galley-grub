package edu.galley.grub;

import java.util.HashMap;
import java.util.Map;

public class ItemFactory {
    private static Map<String, Item> items = new HashMap<>();

    public static Item getItem(String name, Double price){
        return produceItem(new Item(name, price));
    }

    public static Item getItem(String name, Double price, String extra){
        return produceItem(new Item(name, price, extra));
    }

    private static Item produceItem(Item item){
        if (!ItemFactory.contains(item)){
            ItemFactory.add(item);
            return item;
        } else{
            return getItem(item);
        }
    }

    private static boolean contains(Item item){
        return ItemFactory.items.keySet().contains(item.toString());
    }

    private static void add(Item item){
        ItemFactory.items.put(item.toString(), item);
    }

    private static Item getItem(Item item){
        return ItemFactory.items.get(item.toString());
    }

    public static int size(){
        return ItemFactory.items.size();
    }

    public static void clear(){
        ItemFactory.items = new HashMap<>();
    }
}

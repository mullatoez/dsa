package com.dsa.dsa.ds.maps;

import java.util.HashMap;
import java.util.Map;

public class WorkingWithHashMap {

   // public static int sum = 0;
    public static void main(String[] args) {
        int sum = loopMap();
        System.out.println("Total sum is: " + sum);
    }

    static int loopMap() {
        Map<String, Integer> products = new HashMap<>();
        products.put("Laptop", 50000);
        products.put("Fridge", 35000);
        products.put("Bag", 5000);
        products.put("Water Bottle", 1200);
        products.put("Router", 3500);

        var ref = new Object(){
          int sum = 0;
        };

        products.forEach((key,value) -> {
            ref.sum += value;
        });

        return ref.sum;
    }

}
/*
 for (Map.Entry<String, Integer> product : products.entrySet()) {
            sum += product.getValue();
        }

        for (Integer s: products.values()){
            sum += s;
        }

//using forEach
 */
package com.dsa.dsa.ds.maps;

import java.util.HashMap;
import java.util.Map;

public class Maps {
    public static void main(String[] args) {

        Map<String, Integer> empIds = new HashMap<>();
        empIds.put("John",1002);
        empIds.put("Peter",1003);
        empIds.put("Jerry",1004);
        empIds.put("Carl",1005);
        empIds.put("Carl",10059);

        for (Map.Entry<String, Integer> e: empIds.entrySet()){
            System.out.println(e.getValue());
        }
    }
}

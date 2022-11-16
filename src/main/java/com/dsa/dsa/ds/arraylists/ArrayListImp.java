package com.dsa.dsa.ds.arraylists;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ArrayListImp {
    public static void main(String[] args) {
        //syntax
        ArrayList<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(13);
        list.add(14);
        list.add(15);
        list.add(15);
        list.add(15);

        System.out.println(list);
        System.out.println(list.contains(10));
        list.set(0,100);
        System.out.println(list);

        System.out.println("==== sets ====");
        HashSet<Integer> integerHashSet = new HashSet<>(list);
        System.out.println(integerHashSet);

        System.out.println("Way 2...");
        var set = Set.copyOf(list);
        System.out.println(set);
    }
}

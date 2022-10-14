package com.dsa.dsa.ds;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        //syntax
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(); // used when you don't know the size of the elements

        for (int i = 0; i < 5; i++) {
            list.add(scanner.nextInt());
        }

        System.out.println(list);
    }
}

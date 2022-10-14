package com.dsa.dsa.ds.stringmanipulation;

public class StringManipulation {
    public static void main(String[] args) {
        int a = 10;
        int[] arr = {10, 11, 23, 67, 25};
        String name = "Kimanthi Kevin";

        String ab = "Kimkim";
        String ba = "Kimkim";

        //Concepts - String pool - Immutability
        //Heap - Separate memory - Makes our projects more usable
        /*
        ab and ba all point to the same object in memory. This is the use of heap memory
        Strings are immutable for security issues
         */

        System.out.println(ab);
        ab = "Kimkimkim";
        System.out.println(ab);

    }
}

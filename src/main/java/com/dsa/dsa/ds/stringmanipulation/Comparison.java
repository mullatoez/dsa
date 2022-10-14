package com.dsa.dsa.ds.stringmanipulation;

public class Comparison {
    public static void main(String[] args) {
        String a = "kyeiiih";
        String b = "kyeiiih";

        System.out.println(a.equals(b));

        /*
        COMPARISON OF STRINGS
        1. ==
        2. equals()
         */

        String name = new String("Kyeiiih");
        String name2 = new String("kyeiiih");

        System.out.println(name.charAt(0));

        for (int cr = 0; cr < name.length(); cr++){
            System.out.print(name.charAt(cr) + ",");
        }
    }
}

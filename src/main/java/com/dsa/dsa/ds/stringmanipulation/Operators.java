package com.dsa.dsa.ds.stringmanipulation;

import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a' + 'b');
        System.out.println("a" + "b");
        System.out.println((char) ('a' + 3));

        System.out.println("a" + 1); //integer will be converted to its wrapper class i.e Integer

        System.out.println("Kunal" + new Integer(56));

        System.out.println(new Integer(56) + "Hello" + new ArrayList<>()); //The entire thing is converted
        // to string datatype
    }
}

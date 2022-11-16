package com.dsa.dsa.ds.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayImp {
    public static void main(String[] args) {
        /*Scanner in = new Scanner(System.in);

        int[] nos = new int[10];

        for (int i = 0; i < nos.length; i++) {
            nos[i] = in.nextInt();
        }

        for (int i = 0; i < nos.length;i++){
            System.out.println("Val of i: " + nos[i]);
        }

        for (int n: nos){
            System.out.println(n);
        }

        //Print array elements
        System.out.println(Arrays.toString(nos));*/

        //Arrays of objects
        Student[] clas = new Student[5];
        clas[0] = new Student("Kevin",21);
        clas[1] = new Student("Musili",22);
        clas[2] = new Student("Hanson",23);
        clas[3] = new Student("Victor",24);

        System.out.println(Arrays.deepToString(clas));
    }
}

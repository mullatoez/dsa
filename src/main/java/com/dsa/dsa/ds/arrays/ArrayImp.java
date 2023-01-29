package com.dsa.dsa.ds.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayImp {
    public static void main(String[] args) {
        
        //Arrays of objects
        Student[] clas = new Student[5];
        clas[0] = new Student("Kevin",21);
        clas[1] = new Student("Musili",22);
        clas[2] = new Student("Hanson",23);
        clas[3] = new Student("Victor",24);

        System.out.println(Arrays.deepToString(clas));
    }
}

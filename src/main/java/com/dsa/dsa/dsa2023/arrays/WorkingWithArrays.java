package com.dsa.dsa.dsa2023.arrays;

import java.util.Arrays;

public class WorkingWithArrays {

    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;

        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i]);
        }
        System.out.println();

        System.out.println("*************************");

        for (int num: arr){
            System.out.print(num);
        }
    }
}

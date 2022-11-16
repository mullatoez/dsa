package com.dsa.dsa.ds.arrays;

import java.util.Arrays;

public class D2ArrayImp {
    public static void main(String[] args) {
            /*
            1 2 3
            4 5 6
            7 8 9
             */

        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        for (int row = 0; row < arr.length;row++){
            for (int col = 0; col < arr[row].length;col++){
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }

        System.out.println("===========");

       for (int row = 0; row < arr.length;row++){
           System.out.println(Arrays.toString(arr[row]));
       }

        System.out.println("**********");

       for (int[] num : arr){
           System.out.println(Arrays.toString(num));
       }
    }
}

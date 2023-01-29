package com.dsa.dsa.dsa2023.arrays;

import java.util.Arrays;

public class PassingFunctions {
    public static void main(String[] args) {
        int[] nums = {
                1,2,3,4
        };

        alterArrayIndex(nums);

        System.out.println(Arrays.toString(nums));
    }

     static void alterArrayIndex(int[] arr){
        arr[0] = 100;
     }
}

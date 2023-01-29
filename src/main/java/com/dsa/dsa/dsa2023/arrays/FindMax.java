package com.dsa.dsa.dsa2023.arrays;

public class FindMax {
    public static void main(String[] args) {
        int[] arr = {1, 2, 44, 5, 77};
       var ans =  findMax(arr);
        System.out.println(ans);
    }

    static int findMax(int[] arr){
        int max = arr[0];
        for (int j : arr) {
            if (j > max) {
                max = j;
            }
        }
        return max;
    }
}

package com.dsa.dsa.dsa2023.arrays;

import java.util.Arrays;

public class SwappingArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 44, 5, 77};
        reverseArray(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void reverseArray(int[] arr){
        int start = 0;
        int end = arr.length -1;

        while (start < end){
            swap(arr,start,end);
            start++;
            end--;
        }
    }

    static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}

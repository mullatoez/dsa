package com.dsa.dsa.ds.bs2darrays;

import java.util.Arrays;

public class SwapNewElements {
    public static void main(String[] args) {
        int[] nums = {21,22,24,26,27,30};
        System.out.println(Arrays.toString(nums));
        //swap(nums,0,nums.length-1);
       // System.out.println(Arrays.toString(nums));
        reverseOrder(nums);
        System.out.println(Arrays.toString(nums));
    }

    static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    static void reverseOrder(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while (start <= end){
            swap(arr,start,end);
            start++;
            end--;
        }
    }
}

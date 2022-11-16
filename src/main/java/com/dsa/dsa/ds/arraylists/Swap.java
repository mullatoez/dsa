package com.dsa.dsa.ds.arraylists;

import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int[] nums = {1,3,5,6,7,8,9};
        swap(nums,0,nums.length-1);
        System.out.println(Arrays.toString(nums));
    }

    static void swap(int[] arr, int indexOne, int indexTwo){
        int temp = arr[indexOne];
        arr[indexOne] = arr[indexTwo];
        arr[indexTwo] = temp;
    }
}

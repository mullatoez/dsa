package com.dsa.dsa.ds.arraylists;

public class Max {
    public static void main(String[] args) {
        int[] nums = {1,3,5,6,7,8,9};
        /*
        Assume the array is not empty
         */
        findMax(nums);
    }

    static void findMax(int[] arr){

        if (arr.length < 1){
            System.out.println("Array is empty");
            return;
        }
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]){
                max = arr[i];
            }
        }

        System.out.println(max);
    }
}

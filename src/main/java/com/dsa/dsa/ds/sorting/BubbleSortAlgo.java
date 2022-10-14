package com.dsa.dsa.ds.sorting;

import java.util.Arrays;

public class BubbleSortAlgo {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};
        performBubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void performBubbleSort(int[] arr) {
        boolean swapped;
        //run the steps n-1 times
        for (int i = 0; i < arr.length; i++) {
            // for each step, max item will come at the last respective index
            swapped = false;
            for (int j = 1; j < arr.length - i; j++) {
                //swap if the item is smaller than the previous item
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;
                }
            }

            //if no swaps that happened, it means the array is sorted so break out of the loop
            if (!swapped){
                break;
            }
        }
    }
}

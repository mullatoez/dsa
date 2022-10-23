package com.dsa.dsa.ds.sorting;

import java.util.Arrays;

public class CyclicSortAlgorithm {
    // TODO: 10/15/2022 Cycle Sort Algorithm 
    /*
     Cycle sort is an in-place sorting Algorithm, unstable sorting algorithm,
     and a comparison sort that is theoretically optimal in terms of the total
     number of writes to the original array.

     Given range of 1 to n.... use cyclic sort
     Time Complexity: 0(n)
     Auxiliary Space: 0(1)
     */

    public static void main(String[] args) {

        int[] arr = {3, 4, 2, 5, 1};
        cyclic(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void cyclic(int[] arr) {
        int i = 0;

        while (i < arr.length) {
            int correctIndex = arr[i] - 1;
            if (arr[i] != arr[correctIndex]) {
                swap(arr, i, correctIndex);
            } else {
                i++;
            }
        }
    }

    static void swap(int[] arr, int first, int second) {

        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static void question1Amazon() {
        /*
        Given an array nums containing n distinct numbers in the range [0, n],
        return the only number in the range that is missing from the array.

        Source link: https://leetcode.com/problems/missing-number/
         */
    }
}

class Mian {
    public static void main(String[] args) {
        Mian.mian();
    }

    static void mian(){
        System.out.println("Hello World!");
    }
}

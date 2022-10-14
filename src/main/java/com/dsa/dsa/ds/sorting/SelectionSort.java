package com.dsa.dsa.ds.sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {

        int[] arr = {6, 3, 8, 5, 2, 7, 4};
        //var ans = findMin(arr);
       // System.out.println(ans);
       // swapElements(arr,0, arr.length - 1);
        //swapArray(arr);
        //var sum = findSumOfArrayElements(arr);
       // System.out.println(sum);

        int[][] arr2D = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        var ans = findSumOf2DArrayElements(arr2D);
        System.out.println(ans);
    }

    static void selection(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            //find the max and swap with i
            int last = arr.length - 1;
            int maxIndex = getMaxIndex(arr,0,last);
        }
    }

    static void swapArray(int[] arr){

        int start = 0;
        int last = arr.length - 1;

        while (start < last){
            swapElements(arr,start,last);
            start++;
            last--;
        }
    }

    static void swapElements(int[] arr, int firstIndex, int secondIndex){
        int temp = arr[firstIndex];
        arr[firstIndex] = arr[secondIndex];
        arr[secondIndex] = temp;
    }

    static int getMaxIndex(int[] arr, int start, int end) {
        int max = start;

        for (int i = start; i <= end; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }

    static int findMax(int[] arr) {

        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > max){
                max = arr[i];
            }
        }

        return max;
    }

    static int findMin(int[] arr){
        int min = arr[0];

        for (int i = 0; i < arr.length; i++){
            if (arr[i] < min){
                min = arr[i];
            }
        }

        return min;
    }

    static int findSumOfArrayElements(int[] arr){
        int sum = 0;

        for (int i = 0; i < arr.length; i++){
            sum += arr[i];
        }

        return sum;
    }

    static int findSumOf2DArrayElements(int[][] arr){
        int sum = 0;

        for (int row = 0; row < arr.length; row++){
            for (int col = 0; col < arr[row].length; col++){
                sum += arr[row][col];
            }
        }

        return sum;
    }
}

package com.dsa.dsa.ds;

public class SearchMinimumArray {
    public static void main(String[] args) {

        int[] arr = {18, 12, -7, 3, 14, 25};
        var ans = findMin(arr);
        System.out.println(ans);
    }

    static int findMin(int[] arr){
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min){
                min = arr[i];
            }
        }

        return min;
    }
}

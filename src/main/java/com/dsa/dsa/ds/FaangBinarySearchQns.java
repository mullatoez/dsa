package com.dsa.dsa.ds;

public class FaangBinarySearchQns {
    public static void main(String[] args) {

        int[] arr = {10, 23, 90, 21, 28, 33, 36, 43, 55};
        var ans = ceiling(arr, 28);
        System.out.println(ans);
    }

    static int ceiling(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            //find the middle element
            // int mid = (start + end) / 2; // integer has a fixed size
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }

        return start;
    }
}

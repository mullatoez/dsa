package com.dsa.dsa.ds;

public class FlooringANumber {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int target = 15;

        var ans = floor(arr,target);
        System.out.println(ans);
    }

    static int floor(int[] arr, int target) {
        // Time complexity is of 0(log n)
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                return arr[mid];
            }
        }

        return end;
    }
}

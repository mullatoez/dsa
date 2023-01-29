package com.dsa.dsa.ds;

public class BinarySearchAlgorithm {
    public static void main(String[] args) {
        //Time Complexity is O(log n)
        //It works with sorted arrays only
        //Algorithms
        // 1. Find the middle element
        //compare middle element with target and if its equal return otherwise go left or right
        //Best Scenario = O(1)
        //The Worst Scenario is O(log n)

        int[] arr = {-1, 10, 23, 90, 21, 28, 33, 36, 43, 55};
        var ans = binarySearch(arr, 28);
        System.out.println(ans);
    }

    //return the index
    static int binarySearch(int[] arr, int target) {
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

        return -1;
    }

    static int rotatedSearch(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target){
                return nums[i];
            }
        }

        return -1;
    }
}

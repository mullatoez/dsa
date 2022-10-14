package com.dsa.dsa.ds;

public class WorkingWithBinarySearch {
    public static void main(String[] args) {

        int[] sortedArray = {
                1,2,3,4,5,6,7,8,9
        };

        int target = 8;

        var ans = binarySearchRecursive(sortedArray,target,sortedArray[0], sortedArray.length - 1);
        System.out.println(ans);

    }

    public static int binarySearchRecursive(int[] arr, int target, int left, int right) {
        if (left > right) {
            return -1;
        }

        var mid = (int) Math.floor((left + right) / 2);

        if (target == arr[mid]) {
            return mid;
        } else if (target < mid) {
            return binarySearchRecursive(arr, target, left, mid - 1);
        } else {
            return binarySearchRecursive(arr, target, mid + 1, right);
        }

    }
}

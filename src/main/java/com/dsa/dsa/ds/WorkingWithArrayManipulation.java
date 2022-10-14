package com.dsa.dsa.ds;

import java.util.ArrayList;

public class WorkingWithArrayManipulation {
    public static void main(String[] args) {
        //Given an array with elements. Find the element whose digits are even e.g
        //Given a sorted array find a ceiling of number given target 15;
        int[] arr = {123, 22, 1084, 77, 35, 44};
        int[] arr2 = {12, 13, 14, 16, 17, 44}; //O(log n)

        int target = 107;

        var ans = recursiveBinarySearch(arr2,target,0,arr2.length-1);
       // var ans = performBinarySearch(arr2, target);
        System.out.println(ans);

       /* var ans = performLinearSearch(arr, target);
        System.out.println(ans);*/

    }

    static int findEvenNums(int[] arr) {
        ArrayList<Integer> evenNos = new ArrayList<>(); // O(1)

        for (int i = 0; i < arr.length; i++) {
            var split = String.valueOf(arr[i]).split("");
            if (split.length % 2 == 0) {
                evenNos.add(arr[i]);
            }
        } // O(n)

        System.out.println(evenNos);
        return evenNos.size();
    }

    static int iterate2DArray(int[][] nums) {

        int sum = 0; //0(1)
        for (int row = 0; row < nums.length; row++) {
            for (int col = 0; col < nums[row].length; col++) {
                sum += nums[row][col];
                System.out.println(nums[row][col]);
            }
        } // O(n*2) -- Time Complexity
        // Space complexity 0(n)

        return sum;

    }

    static int performLinearSearch(int[] arr, int target) {
        //Worst case for 0(n) (Upper bound)
        //Best case 0(1) (Lower bound)
        //Theta -- when both worst case and best case ni the same
        //Omega upper bound
        for (int i = 0; i < arr.length; i++) {
            if (target == arr[i]) {
                return i;
            }
        }

        return -1;
    }

    static int performBinarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            //int mid = (start + end) / 2;//
            int mid = start + (end - start) / 2;
            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                return arr[mid];
            }
        }

        return -1;
    }

    static int recursiveBinarySearch(int[] arr, int target, int start, int end) {

        if (start > end) {
            return -1;
        }

        int mid = start + (end - start) / 2;

        if (target == arr[mid]) {
            return arr[mid];
        }

        if (target > arr[mid]) {
            return recursiveBinarySearch(arr, target, mid + 1, end);
        }

        if (target < arr[mid]) {
            return recursiveBinarySearch(arr, target, start, mid - 1);
        }

        return -1;
    }
}

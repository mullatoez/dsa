package com.dsa.dsa.ds;

public class LinearSearchAlgo {
    public static void main(String[] args) {
        int[] nums = {
                12, 11, 10, 13, 14, 15, 16, 17
        };

        //Find if 14 exists in the array or not
        var ans = traverseLinearSearch(nums, 17);
        System.out.println(ans);

    }

    static boolean traverseLinearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return false;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return true;
            }
        }

        //executes if not target found
        return false;
    }
}

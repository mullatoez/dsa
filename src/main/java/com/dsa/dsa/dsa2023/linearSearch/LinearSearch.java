package com.dsa.dsa.dsa2023.linearSearch;

public class LinearSearch {
    public static void main(String[] args) {
        int[] nums = {
                1, 2, 3, 4, 5, 56, 6, 7
        };

        var ans = targetExists(nums, 516);

        System.out.println(ans);

        var index = findIndex(nums, 56);
        System.out.println("Found at index " + index);

    }

    static int findNum(int[] arr, int target) {

        //Time Complexity = 0(n)
        //Space Complexity = 0(1)

        if (arr.length == 0) return -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return arr[i];
            }
        }

        return -1;
    }

    static int findNum2(int[] arr, int target) {

        //Time Complexity = 0(n)
        //Space Complexity = 0(1)

        for (int num : arr) {
            if (num == target) {
                return num;
            }
        }

        return -1;
    }

    static int findIndex(int[] arr, int target) {
        if (arr.length != 0) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == target) {
                    return i;
                }
            }

            return -1;
        }

        return -1;
    }

    static boolean targetExists(int[] arr, int target){
        if (arr.length != 0) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == target) {
                    return true;
                }
            }

            return false;
        }

        return false;
    }
}

package com.dsa.dsa.dsa2023.linearSearch;

public class FindMin {
    public static void main(String[] args) {
        int[] nums = {
                10, 20, 30, 40, 5, 56, 6, 7,1
        };

        var ans = findMin(nums);

        System.out.println(ans);
    }

    static int findMin(int[] arr) {

        //Time Complexity = 0(n)
        //Space Complexity = 0(1)

        if (arr.length == 0) return -1;

        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        return min;
    }
}

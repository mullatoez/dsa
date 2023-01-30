package com.dsa.dsa.dsa2023.linearSearch;

public class SearchInRange {
    public static void main(String[] args) {

    }

    static int findNum(int[] arr, int target, int start, int end) {

        //Time Complexity = 0(n)
        //Space Complexity = 0(1)

        if (arr.length == 0) return -1;

        for (int i = start; i <= end; i++) {
            if (arr[i] == target) {
                return arr[i];
            }
        }

        return -1;
    }
}

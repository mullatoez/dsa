package com.dsa.dsa.ds;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 4},
                {5, 6, 7},
                {8, 9, 10}
        };

        int target = 7;

        var ans = max(arr);
        System.out.println(Integer.MIN_VALUE);

    }

    static int search(int[][] arr, int x) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == x) {
                    return arr[row][col];
                }
            }
        }
        return -1;
    }

    static int[] search2D(int[][] arr, int x) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == x) {
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1, -1};
    }

    static int max(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] > max) {
                    max = arr[row][col];
                }
            }
        }
        return max;
    }
}

package com.dsa.dsa.ds.bs2darrays;

import java.util.Arrays;

public class RowColMatrix {
    public static void main(String[] args) {

        int[][] arr = {
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {28, 29, 37, 49},
                {33, 34, 38, 50}
        };

        var ans = searchWithLoop(arr, 34);
        System.out.println(Arrays.toString(ans));

    }

    static int[] search(int[][] matrix, int target) {
        int r = 0;
        int c = matrix.length - 1;

        while (r < matrix.length && c >= 0) {
            if (matrix[r][c] == target) {
                return new int[]{r, c};
            }

            if (matrix[r][c] < target) {
                r++;
            } else {
                c--;
            }
        }

        return new int[]{-1, -1};
    }

    static int[] searchWithLoop(int[][] matrix, int target) {

        for (int row = 0; row < matrix.length; row++)
            for (int col = 0; col < matrix[row].length; col++)
                if (matrix[row][col] == target)
                    return new int[]{row, col};

        return new int[]{-1, -1};
    }
}

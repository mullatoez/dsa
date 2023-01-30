package com.dsa.dsa.dsa2023.linearSearch;

public class SearchIn2DArrays {
    public static void main(String[] args) {
        int[][] nums = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

       var ans = searchIn2dArray(nums, 9);
        System.out.println(ans);

        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
    }


    static int searchIn2dArray(int[][] arr, int target){
        for (int i = 0; i < arr.length; i ++){
            for (int j = 0; j < arr[i].length; j++){
                if (arr[i][j] == target){
                    return arr[i][j];
                }
            }
        }

        return -1;
    }
}

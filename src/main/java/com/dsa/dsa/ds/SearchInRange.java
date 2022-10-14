package com.dsa.dsa.ds;

public class SearchInRange {
    public static void main(String[] args) {
        //Search in 3 in a range of 1 - 4
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        var ans = linearSearch(nums,5,1,4);
        System.out.println(ans);
    }

    static int linearSearch(int[] arr, int target, int start, int end){
        if(arr.length == 0){
          return -1;
        }

        for (int i = start; i <= end; i++){
            if (arr[i] == target){
                return i;
            }
        }

        return -1;
    }
}

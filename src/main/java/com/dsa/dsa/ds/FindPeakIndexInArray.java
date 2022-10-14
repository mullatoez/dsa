package com.dsa.dsa.ds;

public class FindPeakIndexInArray {
    public static void main(String[] args) {

    }

    int peakIndex(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]){
                //you are in desc part of array

                end = mid;
            }else {
                start = mid + 1;
            }
        }

        return start; // or end

    }
}

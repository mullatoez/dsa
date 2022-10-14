package com.dsa.dsa.ds;

public class SearchInMountain {
    public static void main(String[] args) {

    }

    int search(int[] arr, int target) {
        int peak = searchInPeakMountain(arr, target);
        return peak;
    }

    int searchInPeakMountain(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                //you are in desc area
                end = mid;
            } else {
                start = mid + 1;
            }
        }

        return start;
    }

    int binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }

        return -1;
    }
}

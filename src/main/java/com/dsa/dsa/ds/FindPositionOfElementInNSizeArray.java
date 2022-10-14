package com.dsa.dsa.ds;

public class FindPositionOfElementInNSizeArray {
    public static void main(String[] args) {
        //Find a position of an element in a sorted array of infinite numbers
        int[] arr = {
                3,5,7,9,10,90,100,130,140,160,170
        };

        int target = 10;
        var ans = mainAns(arr,target);
        System.out.println(ans);

    }

    static int mainAns(int[] arr, int target){

        int start = 0;
        int end = 2;

        // we can get target as long target is larger than end
        while (target > arr[end]){
            int newStart = end + 1;

            //end is double the size
            end = (end - start + 1) * 3;
            start = newStart;
        }

        return binarySearch(arr,target,start,end);


    }

    static int binarySearch(int[] arr, int target, int start, int end) {

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

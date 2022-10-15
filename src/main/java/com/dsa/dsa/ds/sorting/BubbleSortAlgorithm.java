package com.dsa.dsa.ds.sorting;

import java.util.Arrays;

public class BubbleSortAlgorithm {


    // TODO: 10/15/2022  Bubble Sort Algorithm
    /*
    Bubble sort -
    - is the simplest sorting algorithm that works by repeatedly swapping the adjacent
     elements if they are in the wrong order.
    - it's a pair of comparison algorithm which makes the list to have two sides
    - One side is unsorted (left side) and the other one is sorted (right side)
    - The max element arr[i] is at the end(arr.length - 1)
    - Second max is arr.length - 2
    - Also known as sinking sort or exchange sort
    BIG O Notation
     - Time Complexity: O(N2)
            - Best Case: 0(N)
            - Worst Case: 0(N2) - When is in descending order
     - Auxiliary Space: O(1) - no extra space need. We are not creating any new array in memory
     */
    public static void main(String[] args) {

        int[] arr = {5, 4, 3, 2, 1};
        int[] sortedArr = {-1, 2, -3, 4, -59};
        bubbleSort(sortedArr);
        System.out.println(Arrays.toString(sortedArr));

    }

    static void bubbleSort(int[] arr) {

        //if no swap is happening, it means the array is sorted
        boolean swapped = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                //swap elements
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;
                }
            }

            if (!swapped) {
                break;
            }
        }
    }
}

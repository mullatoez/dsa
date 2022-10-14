package com.dsa.dsa.ds.stringmanipulation;

import java.util.*;

public class ArraysSumWithTarget {

    public static final Random RANDOM = new Random();

    public static void main(String[] args) {

        int[] nums = {-2, -1, -8, -4, 6};
        int sum = -12;
        var ans = findPair(nums, sum);
        System.out.println(Arrays.toString(ans));
        //Find triplet
        /*int[] arr = { 1, 4, 45, 6, 10, 8 };
        int sum = 22;

        var ans = findTripletsSum(arr,sum);
        System.out.println(ans);*/
    }

    static double randomNumber() {
        var ans = RANDOM.nextDouble();
        return ans;
    }

    static boolean compareObjects(Object a, Object b) {
        var ans = Objects.equals(a, b);
        return ans;
    }

    static boolean compareObjects2(Object a, Object b) {
        var ans = a.equals(b);
        return ans;
    }

    static int getIntFromLong(Long a) {
        var ans = Long.valueOf(a).intValue();
        return ans;
    }

    static int[] findTwoNumsEqualToSum(int[] arr, int sum) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == sum) {
                   // System.out.println("First Num: " + arr[i] + " Second Num: " + arr[j]);
                    return new int[]{i,j};
                }
            }
        }

        return new int[]{-1,-1};
    }

    static int[] findTwoElementsSum(int[] arr, int sum) {

        //Time Complexity: O(N), As the whole array is needed to be traversed only once.
        //Auxiliary Space: O(N), A hash map has been used to store array elements.

        HashSet<Integer> possibleNums = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            int diff = sum - arr[i];
            if (possibleNums.contains(diff)) {
                return new int[]{arr[i], diff};
            }

            possibleNums.add(arr[i]);
        }

        return new int[]{-1, -1};
    }

    static boolean findTripletsSum(int[] arr, int sum) {

        //Time Complexity: O(n3).
        //There are three nested loops traversing the array, so the time complexity is O(n^3)

        //Space Complexity: O(1).
        //As no extra space is required.

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if (arr[i] + arr[j] + arr[k] == sum) {
                        System.out.println("" + arr[i] + ", " + arr[j] + ", " + arr[k]);
                        return true;
                    }
                }
            }
        }

        return false;
    }

    static int[] findPair(int[] arr, int sum) {

        for (int j : arr) {
            int diff = sum % j;

            if (diff + j == sum) {
                return new int[]{arr[diff], j};
            }
        }

        return new int[]{-1, -1};
    }
}

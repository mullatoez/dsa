package com.dsa.dsa.ds;

public class LeetCodeSample {
    public static void main(String[] args) {
        //Given an array of numbers, find how many elements contain digits that are even

        int[] nums = {12, 345, 2, 6, 7896};
        var ans = findEvenNumDigits(nums);
        System.out.println(ans);
    }

    static int findEvenNumbers(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                count++;
            }
        }

        return count;
    }

    static int findEvenNumDigits(int[] arr) {
        //loop through the entire arr
        int count = 0;
        for (int num : arr) {
            if (even(num)) {
               count++;
            }
        }

        return count;
    }

    static boolean even(int num) {
        int nod = countNoOfDigitsInNumber(num);
        if (nod % 2 == 0) {
            return true;
        }
        return false;
    }

    static int countNoOfDigitsInNumber(int num) {
        int count = 0;
        while (num > 0) {
            count++;
            num = num / 10;
        }

        return count;
    }
}

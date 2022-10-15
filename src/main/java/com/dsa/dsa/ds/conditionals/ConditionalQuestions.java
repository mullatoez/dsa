package com.dsa.dsa.ds.conditionals;

public class ConditionalQuestions {
    public static void main(String[] args) {
      // fibonacciWithoutRecursion(10);
        System.out.println(nthFibonacciNumbers(10));
    }

    static int getLargestNumber(int[] arr) {
        //assume the largest element is arr[0] and compare with i
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }

    static int nthFibonacciNumbers(int n) {
        //The sequence follows the rule that each number is equal to the sum of the preceding two numbers
        //Qn. Find the nth fibonacci number


        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return (nthFibonacciNumbers(n - 1) + nthFibonacciNumbers(n - 2));
        }

    }

    static void fibonacciWithoutRecursion(int n) {
        //The sequence follows the rule that each number is equal to the sum of the preceding two numbers
        //Qn. Find the nth fibonacci number

        int num1 = 0;
        int num2 = 1;
        int counter = 0;

        while (counter < n) {
            //swap the numbers
            System.out.println(num1 + " ");
            int num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
            counter++;
        }

    }
}

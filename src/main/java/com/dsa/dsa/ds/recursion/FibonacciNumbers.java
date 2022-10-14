package com.dsa.dsa.ds.recursion;

public class FibonacciNumbers {
    public static void main(String[] args) {

        var ans = fibonacci(6);
        System.out.println(ans);
    }

    static int fibonacci(int n){
        if (n < 2){
            return n;
        }
        return  fibonacci(n-1) + fibonacci(n-2);
    }
}

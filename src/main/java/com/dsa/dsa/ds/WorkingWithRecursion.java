package com.dsa.dsa.ds;

public class WorkingWithRecursion {
    public static void main(String[] args) {
        var ans = findFactorialOfANumber(5);
        System.out.println(ans);
    }

    public static int findFactorialOfANumber(int n){
       return n * findFactorialOfANumber(n-1);
    }
}

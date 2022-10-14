package com.dsa.dsa.ds.recursion;

public class Factorial {
    public static void main(String[] args) {
        var ans = fact(5);
        System.out.println(ans);
    }

    static int fact(int n){
        if (n == 1){
            return 1;
        }

        return n * fact(n-1);
    }
}

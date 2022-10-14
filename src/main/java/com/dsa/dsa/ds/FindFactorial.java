package com.dsa.dsa.ds;

public class FindFactorial {
    public static void main(String[] args) {

        var ans = findFactorial(5);
        System.out.println(ans);
    }

    static int findFactorial(int n) {
       if (n > 1)
           return n * findFactorial(n - 1);
       else
           return 1;
    }
}

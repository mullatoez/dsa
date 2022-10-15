package com.dsa.dsa.ds.patterns;

public class PrintingPatternShapes {
    public static void main(String[] args) {
        pattern4(5);
    }

    static void patternOne(int n) {
        /*
         *
         * *
         * * *
         * * * *
         */

        for (int row = 0; row < n; row++) {
            for (int col = 0; col <= row; col++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    static void patternTwo(int n) {
        /*
         * * * *
         * * * *
         * * * *
         * * * *
         */

        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    static void pattern3(int n) {
        /*
         * * * *
         * * *
         * *
         *
         */

        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n - row; col++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    static void pattern4(int n){
        /*
         1
         1 2
         1 2 3
         1 2 3 4
         1 2 3 4 5
         */

        for (int row = 1; row <= n; row++){
            for (int col = 1; col <= row; col++){
                System.out.print(col + " ");
            }

            System.out.println();
        }
    }

    static void pattern5(int n){
        /*
         *
         * *
         * * *
         * * * *
         * * * * *
         * * * *
         * * *
         * *
         *
         */

        for (int row = 0; row < n; row++){
            for (int col = 0; col < n; col++){
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}

package com.dsa.dsa.ds.conditionals;

import java.util.Scanner;

public class WorkingWithLoops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
        Syntax for for loop
        for(initialisation; condition; increment){
        body(logic)
        }
         */

        //Print numbers 1 - 5
       /* int num = 5;
        for (int i = 1; i <= num; i++){
            System.out.print(i + ",");
        }*/

       // scanner.close();

        /*
        int n = scanner.nextInt();

        for (int num = 1; num <= n; num++) {
            System.out.print(num + " ");
        }

        scanner.close();

         */
        workingWithDoWhileLoop();

    }

    static void workingWithWhileLoop(){
        int num = 1;
        while (num <= 10){
            System.out.println(num);
            num++;
        }
    }

    static void workingWithDoWhileLoop(){
        int num = 1;
       do {
               System.out.print(num + " ");
           num++;
       }while (num < 10);
    }
}

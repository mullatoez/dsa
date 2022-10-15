package com.dsa.dsa.ds.conditionals;

public class WorkWithIfStatement {
    public static void main(String[] args) {
        /*
        Syntax for if statement
        if(boolean condition is T or F){
            body(logic)
        }
         */

        int salary = 100000;
        if (salary > 120000){
            salary += 10000;
        }else {
            salary += 30000;
        }

        System.out.println(salary);
    }
}

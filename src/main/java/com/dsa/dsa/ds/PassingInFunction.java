package com.dsa.dsa.ds;

public class PassingInFunction {
    public static void main(String[] args) {
        int[] arr = {20, 21, 22, 32, 24};
        changeIndexZero(arr);
        System.out.println(arr[0]);
    }

    static void changeIndexZero(int[] arr) {
        arr[0] = 100;
    }
}

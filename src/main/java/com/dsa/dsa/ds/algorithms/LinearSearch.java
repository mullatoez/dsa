package com.dsa.dsa.ds.algorithms;

public class LinearSearch {
    public static void main(String[] args) {
       /* int[] arr = {12, 10, 8, 45, 10, 9};
        int search = linearSearch(arr, 9);
        System.out.println(search);*/

        String name = "Kimanthi";
        char characterSearch = characterSearch(name, 'h');
        System.out.println(characterSearch);
    }

    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        for (int i = 0; i < arr.length; i++) {
            if (target == arr[i]) {
                return i;
            }
        }
        return -1;
    }

    static char characterSearch(String input, Character target){
        if (input.length() == 0){
            return 'y';
        }

        for (int i = 0; i < input.length(); i++) {
            if (target == input.charAt(i)){
                return input.charAt(i);
            }
        }

        return 'y';
    }
}

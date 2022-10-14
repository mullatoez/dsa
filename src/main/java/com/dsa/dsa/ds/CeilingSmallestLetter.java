package com.dsa.dsa.ds;

public class CeilingSmallestLetter {
    public static void main(String[] args) {

    }

    static int greatestCharacter(char[] letters, char target){
        //Find The Smallest Letter Greater Than Target
        int start = 0;
        int end = letters.length - 1;

        while(start <= end){
            int mid = start + (end - start) / 2;

            if (target < letters[mid]){
                end = mid -1;
            }else {
                start = mid + 1;
            }
        }

        return letters[start % letters.length];
    }
}

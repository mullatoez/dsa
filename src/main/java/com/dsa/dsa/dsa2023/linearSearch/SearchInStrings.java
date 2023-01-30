package com.dsa.dsa.dsa2023.linearSearch;

public class SearchInStrings {
    public static void main(String[] args) {

        String name = "Kevin";
        var ans = findInString(name, 'v');

        System.out.println(ans);
    }

    static int findInString(String text, char target){
        if (text.length() != 0){
            for (int i = 0; i < text.length(); i++){
                if (text.charAt(i) == target){
                    return i;
                }
            }
        }

        return -1;
    }
}

package com.dsa.dsa.ds;

public class RichestCustomerWealth {
    public static void main(String[] args) {

        int[][] accounts = {
                {4, 5, 6},
                {7, 5, 6},
                {1, 2, 7}
        };
        var ans = maximumWealthInAccount(accounts);
        System.out.println(ans);
    }

    static int maximumWealthInAccount(int[][] accounts) {
        int wealthiestPerson = 0;
        for (int person = 0; person < accounts.length; person++) {
            int sum = 0;
            for (int account = 0; account < accounts[person].length; account++) {
                sum += accounts[person][account];
            }

            if (sum > wealthiestPerson){
                wealthiestPerson = sum;
            }
        }

        return wealthiestPerson;
    }

}

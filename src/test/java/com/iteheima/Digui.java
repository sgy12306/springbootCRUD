package com.iteheima;

public class Digui {
    public static void main(String[] args) {
        //求n的阶乘

        System.out.println(function(5));
    }

    private static int function(int n) {
        int sum = 0;
        if (n == 1) {
            return 1;
        } else {
            return n*function(n-1);
        }
    }
}

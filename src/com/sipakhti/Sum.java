package com.sipakhti;

public abstract class Sum
{
    /*
    Given two integers a and b, which can be positive or negative, find the sum of all the numbers between including them too and return it.
    If the two numbers are equal return a or b.

    Note: a and b are not ordered!
     */
    public static int GetSum(int a, int b)
    {

        int sum = 0;
        // to check whether a and b are in order. if not then make them so
        if (a > b) {
            int c = a;
            a = b;
            b = c;
        }

        if (a == b) return a;

        // main for loop to calculate sum
        for (int i = a; i <= b; i++) {
            sum += i;
        }
        return sum;
    }
}

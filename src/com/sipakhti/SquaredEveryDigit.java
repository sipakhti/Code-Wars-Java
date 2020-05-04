package com.sipakhti;

import com.sun.jdi.InternalException;

public abstract class SquaredEveryDigit {
    /*
    Welcome. In this kata, you are asked to square every digit of a number.

    For example, if we run 9119 through the function, 811181 will come out, because 92 is 81 and 12 is 1.

    Note: The function accepts an integer and returns an integer
     */


    public static Integer squaredEveryDigit(int n) {
        int y = 0;
        String tenp = "";
        int diviser = 1;
        for (int i = 0; i < Integer.toString(n).length() ; i++) {
           diviser *= 10;
           y = (n % diviser)/(diviser/10);
           tenp = y*y + tenp;
        }


        return Integer.parseInt(tenp);
    }

    public int squareDigits(int n) {
        String result = "";

        while (n != 0) {
            int digit = n % 10 ;
            result = digit*digit + result ;
            n /= 10 ;
        }

        return Integer.parseInt(result) ;
    }
}

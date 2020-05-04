package com.sipakhti;

import java.util.Scanner;
import java.lang.String;


public abstract class Maskify {
    /*
    Usually when you buy something, you're asked whether your credit card number, phone number or answer to your most secret question is still correct.
    However, since someone could look over your shoulder, you don't want that shown on your screen.
    Instead, we mask it.

    Your task is to write a function maskify, which changes all but the last four characters into '#'.
     */

    public static String maskerToCharArray(String test) {

        if (test.length() <= 4) return test;

        var testarray = test.toCharArray();

        for (int i = 0; i < test.length() - 4 ; i++) {
            testarray[i] = '#';
        }

        test = "";
        for (char c : testarray) {
            test += c;
        }

        return test;
    }

    public static String maskerSubString(String test){
        if (test.length() <= 4) return test;

        String sub = "#".repeat(test.length()-4) + test.substring(test.length()-4);
        return sub;
    }
}

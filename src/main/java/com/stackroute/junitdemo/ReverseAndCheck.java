package com.stackroute.junitdemo;

import org.junit.*;

public class ReverseAndCheck {
    public static String checkPalindrome(String str)
    {
        if (str==null)
            return "null";
        int i;
        String reverse="";
        for(i=str.length()-1;i>=0;i--)
        {
            reverse=reverse+str.charAt(i);
        }
        if (str==reverse)
            return "this is a palindrome";
        else
            return "this is not a palindrome";

    }

}

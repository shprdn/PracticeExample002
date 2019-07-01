package com.stackroute.junitdemo;

public class PowerOfFour {
    public static int power(int num){
       // int n;
        if (num==0)
            return 0;

        while (num!=0)
        {
            if (num==1)
                return 1;
            if (num%4!=0)
                return 0;
            num = num/4;
        }
        return 1;
    }
}

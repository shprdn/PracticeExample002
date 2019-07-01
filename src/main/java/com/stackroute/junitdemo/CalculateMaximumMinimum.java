package com.stackroute.junitdemo;

public class CalculateMaximumMinimum {
    public int[] compute(int noOfStudent, int[] grade )
    {
        int i;
        int max,min=0;
        int avg;
        int sum=0;
        max=min = grade[0];
        for (i=0;i<noOfStudent;i++)
        {
          //  max = grade[i];
           // min = grade[i];
            if(grade[i]>max)
                max=grade[i];
            if(grade[i]<min)
                min = grade[i];
            sum = sum + grade[i];

        }

        avg = (int) sum /noOfStudent;
        int[] array = {max, min, avg};

        return array;
    }
}

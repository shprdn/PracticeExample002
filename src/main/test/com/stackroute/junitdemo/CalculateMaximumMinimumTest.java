package com.stackroute.junitdemo;

import org.junit.*;

import static org.junit.Assert.*;

public class CalculateMaximumMinimumTest {
    CalculateMaximumMinimum in;
    @Before
    public void setUp(){
        // check = new ReverseAndCheck();
        in = new CalculateMaximumMinimum();
    }
    @After
    public void tearDown(){
        // check=null;
    }
    @BeforeClass
    public static void setUpBeforeClass(){
        System.out.println("before class");
    }
    @AfterClass
    public static void tearDownAfterClass(){
        System.out.println("after class");
    }
    @Test
    public void givenNumberShouldReturnYes(){
       int[]  arr = new int[]{86,65,98,77};
      //  st = new int[]{81, 98,65};
        int[] str = in.compute(4,arr);
        assertArrayEquals(new int[]{98,65,81},str);
    }

}
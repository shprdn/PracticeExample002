package com.stackroute.junitdemo;

import org.junit.*;

import static org.junit.Assert.*;

public class EvenNumTestTest {
    @Before
    public void setUp(){
        // check = new ReverseAndCheck();
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
        assertEquals(true, EvenNumTest.isEven(64));
    }
    @Test
    public void givenNumberShouldNotReturnYes(){
        assertEquals(false, EvenNumTest.isEven(1));
    }
    @Test
    public void givenNumberShouldReturnOne()
    {
        assertEquals(true, EvenNumTest.isEven(0));
    }
    @Test
    public void givenNumberShouldReturnRight()
    {
        assertEquals(true, EvenNumTest.isEven(2));
    }


}
package com.stackroute.junitdemo;

import org.junit.*;

import static org.junit.Assert.*;

public class PowerOfFourTest {
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
        assertEquals(1, PowerOfFour.power(64));
    }
    @Test
    public void givenNumberShouldNotReturnYes(){
        assertEquals(0, PowerOfFour.power(0));
    }
    @Test
    public void givenNumberShouldReturnOne()
    {
        assertEquals(1, PowerOfFour.power(1));
    }
    @Test
    public void givenNumberShouldReturnRight()
    {
        assertEquals(1, PowerOfFour.power(4));
    }

}
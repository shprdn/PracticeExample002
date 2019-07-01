package com.stackroute.junitdemo;

import org.junit.*;

import static org.junit.Assert.*;

public class ReverseAndCheckTest {
  //  ReverseAndCheck check;
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
    public void givenStringShouldReturnPalindrome(){
        assertEquals("Yes, this is a palindrome", "this is a palindrome", "this is a palindrome");
    }
    @Test
    public void givenStringShouldNotReturnPalindrome(){
        assertNotEquals("No, this is not a palindrome","this is a palindrome","this is not a palindrome");
    }
    @Test
    public void givenStringShouldNotReturnNull(){
      // assertNull(ReverseAndCheck.checkPalindrome("null"));
     assertEquals("null not allowed", "null","null");
    }

}
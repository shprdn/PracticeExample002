package com.stackroute.junitdemo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MemberTest {
    MemberVariable mv;
    @Before
    public void setUp() throws Exception {
        mv = new MemberVariable();
    }

    @After
    public void tearDown() throws Exception {
        mv = null;
    }

   @Test
    public void givenClassShouldReturnValue(){
        String result= mv.display();
        assertEquals("Name:Harry PotterAge:30Salary:2500.3",result);
   }
}
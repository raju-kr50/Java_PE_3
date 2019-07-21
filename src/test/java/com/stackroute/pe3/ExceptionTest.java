//package com.stackroute.pe3;
//
//import org.junit.After;
//import org.junit.Before;
//import org.junit.Test;
//
//import static org.junit.Assert.*;
//
//public class ExceptionTest {
//    Exception exception;
//
//    // Create object before running the test cases.
//    @Before
//    public void setUp() {
//        this.exception = new Exception();
//    }
//
//    //Destroy object after running the test cases.
//    @After
//    public void tearDown() {
//        this.exception = null;
//    }
//
//    @Test
//    public void givenAExceptionShouldReturnExceptionMessage() throws Exception {
//        String actualResult = exception.checkException(5,0);
//        assertEquals("This is an exception",actualResult);
//    }
//
//}
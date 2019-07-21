package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentMarksTest {

    // Create object before running the test cases.
    StudentMarks studentMarks;
    @Before
    public void setUp() {
        this.studentMarks = new StudentMarks();
    }

    //Destroy object after running the test cases.
    @After
    public void tearDown() {
        this.studentMarks = null;
    }

    @Test
    public void givenNumberOfStudentNegativeSouldReturnErrorMessage() {

    int[] array = {76,84,34,0,100};
        //act
        String actualResult = studentMarks.gradeChecker("-5", array);
        //assert
        assertEquals("Error: Please enter valid number of students", actualResult);
    }


    @Test(expected = NumberFormatException.class)
    public void givenNumberOfStudentAsStringShouldThrowNumberFormatExcpetion() {
        int[] array = {76,84,34};
        //act
        String actualResult = studentMarks.gradeChecker("sfe", array);
    }

    @Test(expected = NumberFormatException.class)
    public void givenNumberOfStudentsAsNullSouldThrowNumberFormatExcpetion() {

        int[] array = {76,84,34,0,100};
        //act
        String actualResult = studentMarks.gradeChecker("", array);
    }


    @Test
    public void givenMarksGreaterThan100ShouldReturnGreaterThan100() {
        int[] array = {56,890,20,190,0};
        //act
        String actualResult = studentMarks.gradeChecker("5", array);
        //assert
        assertEquals("The grade of 2 student is greater than 100", actualResult);
    }

    @Test
    public void givenMarksLessThanZeroShouldReturnLessThanZero() {
        int[] array = {56,-50,20,90,0};
        //act
        String actualResult = studentMarks.gradeChecker("5", array);
        //assert
        assertEquals("The grade of 1 student is less than 100", actualResult);
    }

}
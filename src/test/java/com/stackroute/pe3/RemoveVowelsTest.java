package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RemoveVowelsTest {

    // Create object before running the test cases.
    RemoveVowels removeVowels;

    @Before
    public void setUp() {
        this.removeVowels = new RemoveVowels();
    }

    //Destroy object after running the test cases.
    @After
    public void tearDown() {
        this.removeVowels = null;
    }

    @Test
    public void givenStringShouldReturnStringWithoutVowel() {
        String[] array = {"India", "United States", "Germany", "Egypt", "czechoslovakia"};
        String[] result = {"Ind", "Untd Stts", "Grmny", "Egypt", "czchslvk"};
        String[] actualResult = removeVowels.vowelEliminator(array);
        assertArrayEquals(result, actualResult);
    }

    @Test
    public void givenNullShouldReturnErrorMessage() {
        //      String[] array = null;
        String[] result = {"Error: Invalid input string"};
        String[] actualResult = removeVowels.vowelEliminator(null);
        assertArrayEquals(result, actualResult);
    }
}
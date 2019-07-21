package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MatrixAdditionTest {

    MatrixAddition matrixAddition;

    // Create object before running the test cases.
    @Before
    public void setUp() {
        this.matrixAddition = new MatrixAddition();
    }

    //Destroy object after running the test cases.
    @After
    public void tearDown() {
        this.matrixAddition = null;
    }

    @Test
    public void givenMatrixShouldReturnMatrixSum() {
        int rows = 4;
        int col = 2;

        int a[][] = {{5, 45}, {15, 19}, {60, 6}, {55, 15}};
        int b[][] = {{9, 10}, {7, 71}, {20, 4}, {15, 60}};
        int[][] InputMatrix = matrixAddition.sumMatrix(a, b, rows, col);
        int[][] expectedResult = {{14, 55}, {22, 90}, {80, 10}, {70, 75}};
        assertArrayEquals(expectedResult, InputMatrix);
    }

    @Test
    public void givenMatrixShouldReturnError() {
        int rows = 3;
        int col = 1;

        int a[][] = {{0}, {0}, {0}};
        int b[][] = {{0}, {0}, {0}};
        int[][] InputMatrix = matrixAddition.sumMatrix(a, b, rows, col);
        int[][] expectedResult = {{0}, {0}, {0}};
        assertArrayEquals("Invalid input elements ", expectedResult, InputMatrix);
    }
}
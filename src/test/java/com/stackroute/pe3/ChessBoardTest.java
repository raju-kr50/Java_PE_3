package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ChessBoardTest {
    ChessBoard chessBoard;

    // Create object before running the test cases.
    @Before
    public void setUp() {
        this.chessBoard = new ChessBoard();
    }

    //Destroy object after running the test cases.
    @After
    public void tearDown() {
        this.chessBoard = null;
    }

    @Test
    public void givenMatrixShouldReturnChessBoard() {
        String[][] expected = {{"WW","BB","WW","BB","WW","BB","WW","BB"},{"BB","WW","BB","WW","BB","WW","BB","WW"},{"WW","BB","WW","BB","WW","BB","WW","BB"},{"BB","WW","BB","WW","BB","WW","BB","WW"},{"WW","BB","WW","BB","WW","BB","WW","BB"},{"BB","WW","BB","WW","BB","WW","BB","WW"},{"WW","BB","WW","BB","WW","BB","WW","BB"},{"BB","WW","BB","WW","BB","WW","BB","WW"}};
        String[][] actual = chessBoard.chess(8,8);
        assertArrayEquals(expected,actual);
    }
}
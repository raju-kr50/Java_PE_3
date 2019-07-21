package com.stackroute.pe3;

public class MatrixAddition {
    public int[][] sumMatrix(int[][] a, int[][] b, int rows, int col) {

        int sum[][] = new int[rows][col];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++)
                sum[i][j] = a[i][j] + b[i][j];


        }
        return sum;
    }


//    public String[][] sumMatrixString(String[][] a , String[][] b){
//
//        String sum[][] = new String[][];
//        for (int i =0 ; i< 3 ; i++)
//        {
//            for(int j=0; j<1;j++)
//                sum[i][j]=a[i][j]+b[i][j];
//
//
//        }
//        return sum;
}

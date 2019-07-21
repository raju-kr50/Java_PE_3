package com.stackroute.pe3;

public class GenerateException {
    public static void main(String[] args) {
        try {
            int[] array1 = new int[]{1, 2, 3, 4, 5};
            System.out.println(array1[9]);
        } catch (ArrayIndexOutOfBoundsException exception1) {
            System.out.println("You are accessing an element which is not present in the array");
        }
        try {
            int[] array2 = new int[-5];
        } catch (NegativeArraySizeException exception2) {
            System.out.println("You are declaring an array of negative size");
        }
        try {
            int number = Integer.parseInt(null);
        } catch (NumberFormatException exception3) {
            System.out.println("Null cannot be converted into integer");
        }
        String ptr = null;
        try {
            if (ptr.equals("gfbjhg"))
                System.out.print("Same");
        } catch (NullPointerException e) {
            System.out.print("NullPointerException Caught");
        }
    }
}

package com.stackroute.pe3;

public class StringException {
    StringException(String string) {
        string = "";
        System.out.println(string);
    }

    public static void main(String[] args) throws Exception {

        try {
            throw new Exception();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("i will get printed");
        }

    }
}


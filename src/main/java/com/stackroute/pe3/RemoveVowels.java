package com.stackroute.pe3;

public class RemoveVowels {
    public String[] vowelEliminator(String[] string) {
        if (string == null) {

            String[] error = {"Error: Invalid input string"};
            return error;
        } else {
            for (int j = 0; j < 5; j++) {
                string[j] = string[j].replaceAll("([a,e,i,o,u])", "");
            }
            return string;
        }
    }
}

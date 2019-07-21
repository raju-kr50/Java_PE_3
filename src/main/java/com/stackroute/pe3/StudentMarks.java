package com.stackroute.pe3;

public class StudentMarks {
    int numOfStudents;
    String result;
    int[] marks;
    int count = 0;

    String gradeChecker(String numberOfStudents, int[] marksOfStudents) {

        numOfStudents = Integer.parseInt(numberOfStudents);


        if (numOfStudents < 1) {
            return "Error: Please enter valid number of students";
        }

        marks = new int[numOfStudents];
        for (int j = 0; j < numOfStudents; j++) {
            marks[j] = marksOfStudents[j];
        }

        if (numOfStudents > 1) {
            for (int i = 0; i < numOfStudents; i++) {
                if (marks[i] > 100) {
                    count++;
                    result = "The grade of " + count + " student is greater than 100";
                } else if (marks[i] < 0) {
                    count++;
                    result = "The grade of " + count + " student is less than 100";
                }
            }
        } else {
            result = "Error: Please enter valid number of students";
        }
        return result;
    }
}


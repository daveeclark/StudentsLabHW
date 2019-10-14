package com.classroomHW;

public class Main {

    public static void main(String[] args) {
        String firstName = "Leon";
        String lastName = "Hunter";
        Double[] examScores = { };
        Student student = new Student(firstName, lastName, examScores);

        student.addExamScore(100.0);
        String output = student.getExamScores();

        // Then
        System.out.println(output);

    }
}

package io.zipcoder;

import java.util.ArrayList;
import java.util.Arrays;

public class Student {
    public String firstName;
    public String lastName;
    public ArrayList<Double> examScores;

    public Student(String firstName, String lastName, Double[] testScores) {
        this.firstName =  firstName;
        this.lastName = lastName;
        this.examScores = new ArrayList<Double>(Arrays.asList(testScores));
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public ArrayList<Double> getTestScores() {
        return examScores;
    }
    public Integer getNumberOfExamsTaken() {
        return examScores.size();
    }
    public String getExamScores() {
        String output = "";
        for (int i = 0; i < examScores.size(); i++) {
            output += "Exam" + i + 1 + " -->" + examScores.get(i) + "\n";
        }
        return output;
    }
    public void addExamScore(Double examScore) {
        examScores.add(examScore);
    }
    public void setExamScores(int examNumber, double newScore) {
        examScores.set(examNumber, newScore);
    }
    public Double getAverageExamScore() {
        Double average = 0.0;
        for (int i = 0; i < examScores.size(); i++) {
            average += examScores.get(i);
        }
        return average/examScores.size();
    }
    @Override
    public String toString() {
        return "Student Name: " + firstName + " " + lastName + "\n" + "Average Scores: " + getAverageExamScore() + "\n" + "Exam Scores: " + getExamScores() + "\n";
    }
}

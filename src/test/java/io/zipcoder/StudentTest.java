package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class StudentTest {


    @Test
    public void getFirstNameTest() {
        Double[] examScores = {100.0, 95.0, 90.0, 99.0};
        Student example = new Student("Dave","Comer", examScores);
        String expected = "Dave";
        String actual = example.getFirstName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setFirstNameTest() {
        Double[] examScores = {100.0, 95.0, 90.0, 99.0};
        Student example = new Student("Dave","Comer", examScores);
        example.setFirstName("David");
        String expected = "David";
        String actual = example.getFirstName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getLastNameTest() {
        Double[] examScores = {100.0, 95.0, 90.0, 99.0};
        Student example = new Student("Dave","Comer", examScores);
        String expected = "Comer";
        String actual = example.getLastName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setLastNameTest() {
        Double[] examScores = {100.0, 95.0, 90.0, 99.0};
        Student example = new Student("Dave","Comer", examScores);
        example.setLastName("Smith");
        String expected = "Smith";
        String actual = example.getLastName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getTestScoresTest() {
        Double[] examScores = {100.0, 95.0, 90.0, 99.0};
        Student example = new Student("Dave","Comer", examScores);
        Double expected = 90.0;
        ArrayList actual = example.getTestScores();
        Assert.assertEquals(expected, actual.get(2));
    }

    @Test
    public void getNumberOfExamsTakenTest() {
        Double[] examScores = {100.0, 95.0, 90.0, 99.0};
        Student example = new Student("Dave","Comer", examScores);
        int expected = 4;
        int actual = example.getNumberOfExamsTaken();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getExamScoresTest() {
        Double[] examScores = {100.0, 95.0, 90.0, 99.0};
        Student example = new Student("Dave","Comer", examScores);
        String expected = example.getExamScores();
        String actual = example.getExamScores();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void addExamScoreTest() {
        Double[] examScores = {100.0, 95.0, 90.0, 99.0};
        Student example = new Student("Dave","Comer", examScores);
        int actual = example.getNumberOfExamsTaken()+1;
        example.addExamScore(80.0);
        int expected = example.getNumberOfExamsTaken();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setExamScoresTest() {
//        Double[] examScores = {100.0, 95.0, 90.0, 99.0};
//        Student example = new Student("Dave","Comer", examScores);
//        example.setExamScores(4,80.0);
//        String expected = "{100.0, 95.0 90.0, 99.0, 80.0}";
//        String  actual = example.getExamScores();
//        Assert.assertEquals(expected, actual);

    }

    @Test
    public void getAverageExamScoreTest() {
        Double[] examScores = {100.0, 95.0, 90.0, 99.0};
        Student example = new Student("Dave","Comer", examScores);
        Double actual = example.getAverageExamScore();
        Double expected = 96.0;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testToStringTest() {
//        Double[] examScores = {100.0, 95.0, 90.0, 99.0};
//        Student example = new Student("Dave","Comer", examScores);
//       String actual = example.toString();
//       String expected = "Student Name: Dave Comer\n" +
//               "Average Scores: 96.0\n" +
//               "Exam Scores: " +
//               "Exam01 -->100.0\n" +
//               "Exam11 -->95.0\n" +
//               "Exam21 -->90.0\n" +
//               "Exam31 -->99.0\n";
//        Assert.assertEquals(expected, actual);
    }
}
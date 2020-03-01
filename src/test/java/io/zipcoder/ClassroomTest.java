package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class ClassroomTest {

    @Test
    public void getStudentsTest() {
        Double[] student1Scores = {100.0, 99.0};
        Double[] student2Scores = {90.0, 89.0};

        Student student1 = new Student("student", "one", student1Scores);
        Student student2 = new Student("student", "two", student2Scores);

        Student[] classRoom = {student1, student2};
        Classroom testClassRoom = new Classroom(classRoom);

        ArrayList<Student> expected = new ArrayList<>(Arrays.asList(classRoom));
        ArrayList<Student> actual = testClassRoom.getStudents();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getAverageExamScoreTest() {
        Double[] student1Scores = {100.0, 99.0};
        Double[] student2Scores = {90.0, 89.0};

        Student student1 = new Student("student", "one", student1Scores);
        Student student2 = new Student("student", "two", student2Scores);

        Student[] classRoom = {student1, student2};
        Classroom testClassRoom = new Classroom(classRoom);

        Double expected = 94.5;
        Double actual = testClassRoom.getAverageExamScore();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void addStudentTest() {
        Classroom classroom = new Classroom(30);
        Double[] examScores = {100.0, 95.0};
        Student newStudent = new Student("Dave", "Comer", examScores);

        Integer beforeAdd = classroom.getStudents().size();
        classroom.addStudent(newStudent);
        ArrayList afterAdd = classroom.getStudents();

        Integer[] expected = {0, 1};
        Integer[] actual = {beforeAdd, afterAdd.size()};

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void removeStudentTest() {
        Double[] student1Scores = {100.0, 99.0};
        Double[] student2Scores = {90.0, 89.0};

        Student student1 = new Student("student", "one", student1Scores);
        Student student2 = new Student("student", "two", student2Scores);

        Student[] classRoom = {student1, student2};
        Classroom testClassRoom = new Classroom(classRoom);

       testClassRoom.removeStudent("student", "one");

        Assert.assertEquals(1, testClassRoom.students.size());
    }

    @Test
    public void getStudentsByScoreTest() {
        Double[] scores1 = {80.0};
        Double[] scores2 = {85.0};
        Double[] scores3 = {90.0};
        Double[] scores4 = {95.0};
        Double[] scores5 = {100.0};

        Student student1 = new Student("student", "one", scores1);
        Student student2 = new Student("student", "two", scores2);
        Student student3 = new Student("student", "three", scores3);
        Student student4 = new Student("student", "four", scores4);
        Student student5 = new Student("student", "five", scores5);

        Student[] classRoom = {student3, student1, student5, student4, student2};
        Student[] expected = {student1, student2, student3, student4, student5};

        Classroom classRoomSorted = new Classroom(classRoom);
        Student[] actual = classRoomSorted.getStudentsByScore();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getGradeBookTest() {
    }
}

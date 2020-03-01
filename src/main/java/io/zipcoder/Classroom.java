package io.zipcoder;

import java.util.ArrayList;
import java.util.Arrays;

public class Classroom {
        ArrayList<Student> students = new ArrayList<>();

        public Classroom(Integer maxNumberOfStudents) {
            this.students = new ArrayList<>(maxNumberOfStudents);
        }

        public Classroom(Student[] classroom) {
            this.students.addAll(Arrays.asList(classroom));
        }

        public Classroom() {
            this.students = new ArrayList<>(30);
        }

        public ArrayList<Student> getStudents() {
            return this.students;
        }

        public Double getAverageExamScore() {
            Double averageScore = 0.0;
            Double sum = 0.0;
            for (int i = 0; i < students.size(); i++) {
                Student stu = students.get(i);
                sum += stu.getAverageExamScore();
                averageScore = sum / students.size();
            }
            return averageScore;
        }

        public void addStudent(Student student) {
            students.add(student);
        }
        public void removeStudent(String firstName, String lastName) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getFirstName().equals(firstName) && students.get(i).getLastName().equals(lastName)) {
               students.remove(i);
                }
            }
        }
        public Student[] getStudentsByScore() {
            Student[] rankings = students.toArray(new Student[students.size()]);
            Student temp;
            for (int i = 1; i < students.size(); i++) {
                for (int j = 0; j < students.size() - i; j++) {
                    if (rankings[j].getAverageExamScore() > rankings[j+1].getAverageExamScore()) {
                        temp = rankings[j+1];
                        rankings[j+1] = rankings[j];
                        rankings[j] = temp;
                    }
                }
            }
            return rankings;
        }
        public void getGradeBook() {
//            HashMap<Student, Character> grades = new HashMap<>();
//            Student[] sortedStudents = getStudentsByScore();
//            Integer rankings = 1;
//
//            for (Student student : sortedStudents) {
//                Double percentile = (Double)(rankings) / (double)(Classroom.size())
//            }
        }
}

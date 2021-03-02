package org.fundacionjala.prog101.Student;

public class Student {
    public static int NUM_OF_TESTS = 5;
    protected String name;
    protected int[] test;
    protected String courseGrade;

    public Student() {}

    public Student(String studentName) {
        this.name = studentName;
    }

    public String getCourseGrade() {
        return courseGrade;
    }

    public void setName(String studentName) {
        this.name = studentName;
    }

    public String getName() {
        return name;
    }

    public int getTestScore(int score) {
        return 1;
    }

    public void setTestScore() {

    }

    public String computeCourseGrade(String grade) {
        if() {
            this.courseGrade =  "Aprobado";
        }
        this.courseGrade =  "Reprobado";
        return courseGrade;
    }
}

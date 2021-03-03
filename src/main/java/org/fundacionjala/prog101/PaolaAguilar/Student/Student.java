package org.fundacionjala.prog101.PaolaAguilar.Student;

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

    public int getTestScore(int testScore) {
        return test[testScore];
    }

    public void setTestScore(int score, int test) {
        this.test[test] = score;
    }

    public String computeCourseGrade(String grade) {
        return courseGrade;
    }
}

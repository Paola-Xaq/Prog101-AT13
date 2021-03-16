package org.fundacionjala.prog101.DanielaSC.Poo.Student2;

public class Student {
    public int NUM_OF_TESTS;
    protected String name;
    protected int[] test;
    protected String courseGrade;

    public Student(String name, int nTests) {
        this.name = name;
        NUM_OF_TESTS = nTests;
        test = new int[NUM_OF_TESTS];
    }

    public Student () {

    }

    public String getCourseGrade() {
        return courseGrade;
    }

    public String getName() {
        return name;
    }

    public int getTestScore(int testScore) {
        int testSc = test[testScore];
        return testSc;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTestScore(int nTest, int score) {
        this.test[nTest] = score;
    }

    public String computeCourseGrade() {
        return "";
    }
}

package org.fundacionjala.prog101.jessicka;

public class Student {
    public int NUM_OF_TESTS = 5;
    protected String name;
    protected int test[] = new int[NUM_OF_TESTS];
    protected String courseGrade = "approved";

    public Student() {

    }

    public Student(String name) {
        setName(name);
    }

    public String getCourseGrade() {
        return courseGrade;
    }

    public String getName() {
        return name;
    }

    public int getTestScore(int testScore) {
        return test[testScore];
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTestScore(int score, int test) {
        this.test[test] = score;
    }

    public String computeCourseGrade() {
        return courseGrade;
    }
}

package org.fundacionjala.prog101.edsonAnawaya.practice2.student;

public class Student {
    final public int NUM_OF_TEST = 3;
    protected String name;
    protected int[] test;
    protected String courseGrade;

    public Student() {
        this.courseGrade = "AT-12";
        this.test = new int [NUM_OF_TEST];
    }

    public Student(String courseGrade) {
        this.test = new int [NUM_OF_TEST];
        this.courseGrade = courseGrade;
    }

    public String getCourseGrade() {
        return courseGrade;
    }

    public String getName() {
        return name;
    }

    public int getTestScore(int index) {
        return test[index];
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTestScore(int index, int newScore) {
        this.test[index] = newScore;
    }

    public String computeCourseGrade() {
        int sumAverage = 0;
        for (int i = 0; i < test.length; i++) {
            sumAverage+=test[i];
        }
        sumAverage/=NUM_OF_TEST;
        return sumAverage > 80 ? "APPROVED": "REPROBATE";
    }
}

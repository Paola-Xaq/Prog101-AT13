package org.fundacionjala.prog101.joelrojas.student.classobject;
public class Student {
    public final int NUM_OF_TEST;
    protected String name;
    protected int[] test;
    protected String courseGrade;
    public Student() {
        NUM_OF_TEST = 5;
    }

    public Student(String name, int numOfTest, String courseGrade) {
        NUM_OF_TEST = numOfTest;
        test = new int[NUM_OF_TEST];
        this.name =name;
        this.courseGrade = courseGrade;
    }

    public String getCourseGrade() {
        return this.courseGrade;
    }

    public String getName() {
        return this.name;
    }

    public int getTestScore(int numberOfTest) {
        return this.test[numberOfTest];
    }

    public void setName(String nameStudent) {
        this.name = nameStudent;
    }

    public void setTestScore(int testScore, int numberOfTest) {
        this.test[numberOfTest] = testScore;
    }

    public String computeCourseGrade() {
        return "";
    }
}
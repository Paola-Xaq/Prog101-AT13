package org.fundacionjala.prog101.Excercies_Jorge.Student;

public class Student {
    private final int numofTests = 5;
    private String name;
    private int[] test = new int[numofTests];
    private String courseGrade;
    public Student(final String sName, final String sCourseGrade) {
        this.name = sName;
        this.courseGrade = sCourseGrade;
    }
    /**
     * Method that returns grade of the student
     * */
    public String getCourseGrade() {
        return courseGrade;
    }
    /**
     * Method that returns the name of the student
     * */
    public String getName() {
        return name;
    }
    /**
     * Method that returns the score of an specific examn
     * */
    public int getTestScore(final int tesNumber) {
        return test[tesNumber - 1];
    }
    /**
     * Method to set the students name
     * */
    public void setName(final String sName) {
        this.name = sName;
    }
    /**
     * Method to set the specific score of an exam
     * */
    public void setTestScore(final int testNumber, final int score) {
        test[testNumber - 1] = score;
    }
    /**
     * Method that returns the average score
     * */
    public float computeCourseGrade() {
        int sum = 0;
        for (int i = 0; i < numofTests; i++) {
            sum = sum + test[i];
        }
        float averageScore = sum / numofTests;
        return averageScore;
    }
}

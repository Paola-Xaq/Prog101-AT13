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
     * Method that says if a String has a special delimiter
     * */
    public String getCourseGrade() {
        return courseGrade;
    }
    /**
     * Method that says if a String has a special delimiter
     * */
    public String getName() {
        return name;
    }
    /**
     * Method that says if a String has a special delimiter
     * */
    public int getTestScore(final int tesNumber) {
        return test[tesNumber - 1];
    }
    /**
     * Method that says if a String has a special delimiter
     * */
    public void setName(final String sName) {
        this.name = sName;
    }
    /**
     * Method that says if a String has a special delimiter
     * */
    public void setTestScore(final int testNumber, final int score) {
        test[testNumber - 1] = score;
    }
    /**
     * Method that says if a String has a special delimiter
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

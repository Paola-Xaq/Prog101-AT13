package org.fundacionjala.prog101.Research;

public class Student {
    public final int NUM_OF_TESTS = 10;
    protected String name;
    protected int[] test = new int[NUM_OF_TESTS];
    protected String courseGrade;
    /**
     * Class student that stores scores of tests
     */
    public Student() {
    }
    public Student(final String name) {
    }

    /**
     * Method to return the
     * @return
     */
    public String getCourseGrade() {
        return courseGrade;
    }

    /**
     * Method that returns this student's name
     * @return String name
     */
    public String getName() {
        return name;
    }

    /**
     * Method to get Test Score from test list
     * @param numberOfTest
     * @return int testScore
     */
    public int getTestScore(final int numberOfTest) {
        return test[numberOfTest - 1];
    }

    /**
     * Mehotd to set the name of this student.
     * @param name
     */
    public void setName(final String name) {
        this.name = name;
    }

    /**
     * Method to set a Test score in the given position in the test list.
     * @param numberOfTest
     * @param grade
     */
    public void setTestScore(final int numberOfTest, final int grade) {
        test[numberOfTest - 1] = grade;
    }

    /**
     * Method to calculate the letter grade from the average of test grades in test list.
     */
    public void computeCourseGrade() {
        int courseGrade = 0;
        for (int pos = 0; pos < test.length; pos++) {
            int grade = test[pos];
            courseGrade += grade;
        }
        courseGrade /= NUM_OF_TESTS;
        switch (courseGrade) {
            case 7: this.courseGrade = "D"; break;
            case 8: this.courseGrade = "C"; break;
            case 9: this.courseGrade = "B"; break;
            case 10: this.courseGrade = "A"; break;
            default : this.courseGrade = "F";
        }
    }
}

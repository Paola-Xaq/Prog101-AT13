package org.fundacionjala.prog101.Saul.Student;

public class Student {
    public final int NUM_OF_TESTS = 10;
    protected String name;
    protected int[] test = new int[NUM_OF_TESTS];
    protected String courseGrade;
    private static final int SCORE_7 = 7;
    private static final int SCORE_8 = 8;
    private static final int SCORE_9 = 9;
    private static final int SCORE_10 = 10;
    private static final String SCORE_A = "A";
    private static final String SCORE_B = "B";
    private static final String SCORE_C = "C";
    private static final String SCORE_D = "D";
    private static final String SCORE_F = "F";
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
            case SCORE_7: this.courseGrade = SCORE_D; break;
            case SCORE_8: this.courseGrade = SCORE_C; break;
            case SCORE_9: this.courseGrade = SCORE_B; break;
            case SCORE_10: this.courseGrade = SCORE_A; break;
            default : this.courseGrade = SCORE_F;
        }
    }
}

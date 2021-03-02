package org.fundacionjala.prog101.cristianchoque.homework;

public class Student {

    public int NUM_OF_TEST = 3;
    public int GRADE = 50;
    protected String name;
    protected int[] test;;
    protected String courseGrade;

    public Student() { }

    /**
     *
     * @param name
     */
    public Student(final String name) {
        this.name = name;
    }

    /**
     *
     * @return
     */
    public String getCourseGrade() {
        computeCourseGrade();
        return courseGrade;
    }

    /**
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param i
     * @return
     */
    public int getTestScore(final int i) {
        return this.test[i - 1];
    }

    /**
     *
     * @param name
     */
    public void setName(final String name) {
        this.name = name;
    }

    /**
     *
     * @param test
     */
    public void setTest(final int[] test) {
        if (test.length == NUM_OF_TEST) {
            this.test = test;
        }
        System.out.println("Solo debe colocar notas de 3 test");
    }

    /**
     *
     * @return
     */
    public String computeCourseGrade() {
        String result;
        Double finalGrade;
        Double add = 0.0;
        for (int i = 0; i < test.length; i ++) {
            add = add + test[i];
        }
        finalGrade = add / (test.length);

        if (finalGrade > GRADE) {
            result = "Aprobado";
        } else {
            result = "Reprobado";
        }
        courseGrade = result;
        return result;
    }
}

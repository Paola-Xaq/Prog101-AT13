package org.fundacionjala.prog101.ExercicesJP.PracticaStudent;

public class Student {

    public static final int NUM_OF_TESTS  = 5;
    protected String name;
    protected int[] test;
    protected String courseGrade;

    public Student() {
    }

    public Student(String name) {
        this.name = name;
        this.test = new int[NUM_OF_TESTS];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int[] getTest() {
        return test;
    }

    public void setTest(int[] test) {
        this.test = test;
    }

    public String getCourseGrade() {
        return courseGrade;
    }

    public int getTestScore(int pos){
        return this.test[pos];
    }

    public void setTestScore(int score,int pos){
       try {
           this.test[pos] = score;
       }catch (Exception e){
           System.out.println("No se puede agregar elemento fuera el tamaño del vector "+e.getMessage());
       }
    }

    public String computeCourseGrade() {
        int sum = 0;
        for (int test : this.test) {
            sum += test;
        }
        int promedio = sum / this.test.length;
        return promedio>=80 ? "GRADUATE" : "UNDERGRADUATE";
    }
}

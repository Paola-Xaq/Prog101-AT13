package org.fundacionjala.prog101.ExercicesJP.PracticaStudentInheritance;

public class UnderGraduateStudent extends Student{

    public UnderGraduateStudent(String name) {
        super(name);
    }

    public String computeCourseGrade() {
        int sum = 0;
        for (int test : this.test) {
            sum += test;
        }
        int promedio = sum / this.test.length;
        return promedio>=51 ? "GRADUATE" : "UNDERGRADUATE";
    }
}

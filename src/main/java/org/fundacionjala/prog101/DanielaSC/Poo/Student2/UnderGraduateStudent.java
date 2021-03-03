package org.fundacionjala.prog101.DanielaSC.Poo.Student2;

public class UnderGraduateStudent extends Student{
    public UnderGraduateStudent(String name, int numTests) {
        super(name, numTests);
    }

    @Override
    public String computeCourseGrade() {
        courseGrade = "Reproved";
        int sum = 0;
        for (int i : test) {
            sum += i;
        }
        int prom = sum / test.length - 1;
        if(prom <= 80){
            return courseGrade;
        }
        courseGrade = "Approved";
        return courseGrade;
    }
}

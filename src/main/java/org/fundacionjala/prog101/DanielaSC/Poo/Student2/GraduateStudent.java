package org.fundacionjala.prog101.DanielaSC.Poo.Student2;

public class GraduateStudent extends Student{
    public GraduateStudent(String name, int nTests) {
        super(name, nTests);
    }

    @Override
    public String computeCourseGrade() {
        courseGrade = "Reproved";
        int sum = 0;
        for (int i : test) {
            sum += i;
        }
        int prom = sum / test.length - 1;
        if(prom >= 80){
            courseGrade = "Approved";
            return courseGrade;
        }
        return courseGrade;
    }
}

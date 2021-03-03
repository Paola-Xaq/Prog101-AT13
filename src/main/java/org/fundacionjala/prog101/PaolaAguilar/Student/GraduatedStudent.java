package org.fundacionjala.prog101.PaolaAguilar.Student;

public class GraduatedStudent extends Student{
    public String computeCourseGrade() {

        int totalSum = 0;
        for (int t:test) {
            totalSum += t;
        }
        int prom = totalSum / test.length;

        if(prom >= 81){
            courseGrade = "Aprove";
        } else {
            courseGrade = "Reproved";
        }
        return courseGrade;
    }
}

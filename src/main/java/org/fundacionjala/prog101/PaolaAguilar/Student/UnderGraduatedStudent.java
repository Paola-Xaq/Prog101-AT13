package org.fundacionjala.prog101.PaolaAguilar.Student;

public class UnderGraduatedStudent extends Student {
    private String result;
    public String computeCourseGrade() {

        int totalSum = 0;
        for (int t:test) {
            totalSum += t;
        }
        int prom = totalSum / test.length;

        if(prom >= 51){
            courseGrade = "Aprove";
        } else {
            courseGrade = "Reproved";
        }
        return courseGrade;
    }
}

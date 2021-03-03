package org.fundacionjala.prog101.jessicka.TypeStudent;

import org.fundacionjala.prog101.jessicka.Student;

public class UnderGraduatedStudent extends Student {
    public String computeCourseGrade() {
        int sum = 0;
        for (int t:test) {
            sum += t;
        }
        int prom = sum / test.length;

        if (prom >= 51){
            return courseGrade;
        } else {
            courseGrade = "reproved";
            return courseGrade;
        }
    }
}

package org.fundacionjala.prog101.edsonAnawaya.practice2.graduatedStudent;

import org.fundacionjala.prog101.edsonAnawaya.practice2.student.Student;

public class GraduatedStudent extends Student {


    public String computeCourseGrade() {
        int sumAverage = 0;
        for (int i = 0; i < test.length; i++) {
            sumAverage+=test[i];
        }
        sumAverage/=NUM_OF_TEST;
        return sumAverage > 80 ? "APPROVED": "REPROBATE";
    }
}

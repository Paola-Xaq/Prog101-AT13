package org.fundacionjala.prog101.edsonAnawaya.practice2.graduatedStudent;

import org.fundacionjala.prog101.edsonAnawaya.practice2.student.Student;

public class UnderGraduatedStudent extends Student {

    @Override
    public  String computeCourseGrade () {
        int sumAverage = 0;
        for (int i = 0; i < test.length; i++) {
            sumAverage+=test[i];
        }
        sumAverage/=NUM_OF_TEST;
        return sumAverage > 50 ? "APPROVED": "REPROBATE";
    }
}

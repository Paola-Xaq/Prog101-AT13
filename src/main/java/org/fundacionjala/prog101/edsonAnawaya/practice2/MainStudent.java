package org.fundacionjala.prog101.edsonAnawaya.practice2;

import org.fundacionjala.prog101.edsonAnawaya.practice2.graduatedStudent.GraduatedStudent;
import org.fundacionjala.prog101.edsonAnawaya.practice2.graduatedStudent.UnderGraduatedStudent;
import org.fundacionjala.prog101.edsonAnawaya.practice2.student.Student;

public class MainStudent {

    public static void main(final String[] args) {
        Student student = new Student();
        student.setName("edson");
        student.setTestScore(0,90);
        student.setTestScore(1,81);
        student.setTestScore(2,81);
        System.out.println(student.getCourseGrade());
        System.out.println(student.getName());
        System.out.println(student.getTestScore(0));
        System.out.println(student.getTestScore(1));
        System.out.println(student.getTestScore(2));
        System.out.println(student.computeCourseGrade());

        System.out.println("-------------------------------------");

        UnderGraduatedStudent underGraduatedStudent = new UnderGraduatedStudent();

        underGraduatedStudent.setName("edson 2");
        underGraduatedStudent.setTestScore(0,70);
        underGraduatedStudent.setTestScore(1,70);
        underGraduatedStudent.setTestScore(2,70);
        System.out.println(underGraduatedStudent.getCourseGrade());
        System.out.println(underGraduatedStudent.getName());
        System.out.println(underGraduatedStudent.getTestScore(0));
        System.out.println(underGraduatedStudent.getTestScore(1));
        System.out.println(underGraduatedStudent.getTestScore(2));
        System.out.println(underGraduatedStudent.computeCourseGrade());

        System.out.println(student.computeCourseGrade());

        System.out.println("-------------------------------------");
        GraduatedStudent graduatedStudent = new GraduatedStudent();

        graduatedStudent.setName("edson 3");
        graduatedStudent.setTestScore(0,70);
        graduatedStudent.setTestScore(1,70);
        graduatedStudent.setTestScore(2,70);
        System.out.println(graduatedStudent.getCourseGrade());
        System.out.println(graduatedStudent.getName());
        System.out.println(graduatedStudent.getTestScore(0));
        System.out.println(graduatedStudent.getTestScore(1));
        System.out.println(graduatedStudent.getTestScore(2));
        System.out.println(graduatedStudent.computeCourseGrade());

        System.out.println(student.computeCourseGrade());


    }
}

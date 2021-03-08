package org.fundacionjala.prog101.ExercicesJP.PracticaStudentInheritance;

public class Main {
    public static void main(String[] args) {
        UnderGraduateStudent student1 = new UnderGraduateStudent("Juan");
        student1.setTestScore(51,0);
        student1.setTestScore(60,1);
        student1.setTestScore(70,2);
        student1.setTestScore(56,3);
        student1.setTestScore(63,4);

        System.out.println(student1.getTestScore(0));
        System.out.println(student1.getTestScore(1));
        System.out.println(student1.getTestScore(4));

        System.out.println(student1.computeCourseGrade());


        GraduateStudent student2 = new GraduateStudent("Juan");
        student2.setTestScore(71,0);
        student2.setTestScore(90,1);
        student2.setTestScore(80,2);
        student2.setTestScore(66,3);
        student2.setTestScore(93,4);

        System.out.println(student2.getTestScore(0));
        System.out.println(student2.getTestScore(1));
        System.out.println(student2.getTestScore(4));

        System.out.println(student2.computeCourseGrade());
    }
}

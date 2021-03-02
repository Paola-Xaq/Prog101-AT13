package org.fundacionjala.prog101.ExercicesJP.PracticaStudent;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Juan");
        student.setTestScore(100,0);
        student.setTestScore(75,1);
        student.setTestScore(80,2);
        student.setTestScore(45,3);
        student.setTestScore(68,4);

        System.out.println(student.getTestScore(0));
        System.out.println(student.getTestScore(1));
        System.out.println(student.getTestScore(4));

        System.out.println(student.computeCourseGrade());
    }
}

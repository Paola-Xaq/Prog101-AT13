package org.fundacionjala.prog101.cristianchoque.homework;

public class Main {

    public static void main(final String[] args) {

        int[] test = {1, 2, 3};

        Student st1 = new Student();

        st1.setName("Cris");

        st1.setTest(test);

        System.out.println(st1.getName());
        System.out.println(st1.getTestScore(1));
        System.out.println(st1.getTestScore(2));
        System.out.println(st1.getTestScore(2));
        System.out.println(st1.getCourseGrade());

        int test2[] = {2, 2, 2};

        Student st2 = new Student("pepe");

        st2.setTest(test2);

        System.out.println(st2.getName());
        System.out.println(st2.getTestScore(1));
        System.out.println(st2.getTestScore(2));
        System.out.println(st2.getTestScore(2));
        System.out.println(st2.getCourseGrade());




    }

}

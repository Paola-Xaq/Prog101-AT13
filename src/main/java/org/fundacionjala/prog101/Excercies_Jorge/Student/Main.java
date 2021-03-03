package org.fundacionjala.prog101.Excercies_Jorge.Student;

    public final class Main {
        private Main() {
        }
    public static void main(final String[] args) {
        final int test1 = 1;
        final int test2 = 2;
        final int test3 = 3;
        final int test4 = 4;
        final int test5 = 5;
        final int maxScore = 100;
        //Class Student
        Student yorch = new Student("Jorge", "Undergraduated");
        yorch.setTestScore(test1, maxScore);
        yorch.setTestScore(test2, maxScore);
        yorch.setTestScore(test3, maxScore);
        yorch.setTestScore(test4, maxScore);
        yorch.setTestScore(test5, maxScore);
        System.out.println(yorch.getTestScore(test1));
        System.out.println(yorch.getTestScore(test2));
        System.out.println(yorch.getTestScore(test3));
        System.out.println(yorch.getTestScore(test4));
        System.out.println(yorch.getTestScore(test5));
        System.out.println(yorch.computeCourseGrade());
    }
}

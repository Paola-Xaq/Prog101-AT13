package org.fundacionjala.prog101.joelrojas.student.inheritance;

public class GraduateStudent extends Student{

    public GraduateStudent(String name, int numOfTest) {
        super(name, numOfTest);
    }
    @Override
    public String computeCourseGrade() {
        String score = super.computeCourseGrade();
        if (Integer.parseInt(score) > 80) {
            courseGrade = "aproved";
        } else {
            courseGrade = "reproved";
        }
        return courseGrade;
    }
}

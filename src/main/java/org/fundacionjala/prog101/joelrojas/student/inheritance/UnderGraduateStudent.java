package org.fundacionjala.prog101.joelrojas.student.inheritance;

public class UnderGraduateStudent extends Student{
    public UnderGraduateStudent(String name, int numOfTest) {
        super(name, numOfTest);
    }
    @Override
    public String computeCourseGrade() {
        String score = super.computeCourseGrade();
        if (Integer.parseInt(score) > 50) {
            courseGrade = "aproved";
        } else {
            courseGrade = "reproved";
        }
        return courseGrade;
    }
}

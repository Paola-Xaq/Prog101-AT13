package org.fundacionajala.prog101.Saul;
import org.fundacionjala.prog101.Research.Student;
import org.fundacionjala.prog101.Saul.Calculator;
import org.junit.Test;

import static org.junit.Assert.*;
public class StudentTest {
    @Test
    public void setName_NameSaul_getNameIsSaul() {
        String name = "Saul";
        Student student = new Student();
        student.setName(name);

        String expected = name;
        String actual = student.getName();
        assertEquals(expected, actual);
    }
    @Test
    public void setTestScore_enterTwoTests_getTestsValues() {
        String name = "Saul";
        Student student = new Student(name);
        int test1 = 1;
        int test1Grade = 9;
        student.setTestScore(test1, test1Grade);
        int expected = test1Grade;
        int actual = student.getTestScore(test1);
        assertEquals(expected, actual);
    }
    @Test
    public void computeCourseGrade_EnterTenGradesWithAverageFive_getGradeF() {
        String name = "Saul";
        Student student = new Student(name);
        student.setTestScore(1, 5);
        student.setTestScore(2, 5);
        student.setTestScore(3, 5);
        student.setTestScore(4, 5);
        student.setTestScore(5, 5);
        student.setTestScore(6, 5);
        student.setTestScore(7, 5);
        student.setTestScore(8, 5);
        student.setTestScore(9, 5);
        student.setTestScore(10, 5);
        String expected = "F";
        student.computeCourseGrade();
        String actual = student.getCourseGrade();
        assertEquals(expected, actual);
    }
    @Test
    public void computeCourseGrade_EnterTenGradesWithAverage7_getGradeD() {
        String name = "Saul";
        Student student = new Student(name);
        student.setTestScore(1, 7);
        student.setTestScore(2, 7);
        student.setTestScore(3, 7);
        student.setTestScore(4, 7);
        student.setTestScore(5, 7);
        student.setTestScore(6, 7);
        student.setTestScore(7, 7);
        student.setTestScore(8, 7);
        student.setTestScore(9, 7);
        student.setTestScore(10,7);
        String expected = "D";
        student.computeCourseGrade();
        String actual = student.getCourseGrade();
        assertEquals(expected, actual);
    }
    @Test
    public void computeCourseGrade_EnterTenGradesWithAverage8_getGradeC() {
        String name = "Saul";
        Student student = new Student(name);
        student.setTestScore(1, 8);
        student.setTestScore(2, 8);
        student.setTestScore(3, 8);
        student.setTestScore(4, 8);
        student.setTestScore(5, 8);
        student.setTestScore(6, 8);
        student.setTestScore(7, 8);
        student.setTestScore(8, 8);
        student.setTestScore(9, 8);
        student.setTestScore(10,8);
        String expected = "C";
        student.computeCourseGrade();
        String actual = student.getCourseGrade();
        assertEquals(expected, actual);
    }
    @Test
    public void computeCourseGrade_EnterTenGradesWithAverageNine_getGradeB() {
        String name = "Saul";
        Student student = new Student(name);
        student.setTestScore(1, 9);
        student.setTestScore(2, 9);
        student.setTestScore(3, 9);
        student.setTestScore(4, 9);
        student.setTestScore(5, 9);
        student.setTestScore(6, 9);
        student.setTestScore(7, 9);
        student.setTestScore(8, 9);
        student.setTestScore(9, 9);
        student.setTestScore(10,9);
        String expected = "B";
        student.computeCourseGrade();
        String actual = student.getCourseGrade();
        assertEquals(expected, actual);
    }
    @Test
    public void computeCourseGrade_EnterTenGradesWithAverageTen_getGradeA() {
        String name = "Saul";
        Student student = new Student(name);
        student.setTestScore(1, 10);
        student.setTestScore(2, 10);
        student.setTestScore(3, 10);
        student.setTestScore(4, 10);
        student.setTestScore(5, 10);
        student.setTestScore(6, 10);
        student.setTestScore(7, 10);
        student.setTestScore(8, 10);
        student.setTestScore(9, 10);
        student.setTestScore(10,10);
        String expected = "A";
        student.computeCourseGrade();
        String actual = student.getCourseGrade();
        assertEquals(expected, actual);
    }
    @Test
    public void computeCourseGrade_EnterTenGradesWithAverageZero_getGradeF() {
        String name = "Saul";
        Student student = new Student(name);
        student.setTestScore(1, 0);
        student.setTestScore(2, 0);
        student.setTestScore(3, 0);
        student.setTestScore(4, 0);
        student.setTestScore(5, 0);
        student.setTestScore(6, 0);
        student.setTestScore(7, 0);
        student.setTestScore(8, 0);
        student.setTestScore(9, 0);
        student.setTestScore(10,0);
        String expected = "F";
        student.computeCourseGrade();
        String actual = student.getCourseGrade();
        assertEquals(expected, actual);
    }
}

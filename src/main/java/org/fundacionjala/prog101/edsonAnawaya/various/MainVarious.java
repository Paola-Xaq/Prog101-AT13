package org.fundacionjala.prog101.edsonAnawaya.various;

public class MainVarious {
    public static void main(final String[] args) {

        MainVarious mainVarious = new MainVarious();
        System.out.println(mainVarious.person("name"));
        System.out.println(mainVarious.person("name",21));
        System.out.println(mainVarious.person("name",21,"3ro"));
        System.out.println(mainVarious.person("name",21,"3ro","UMSA"));

    }

    public String person(String name) {
        return name;
    }

    public String person(String name, int age) {
        return name + " " + age;
    }

    public String person(String name, int age, String courseGrade) {
        return name + " " + age+" "+courseGrade;
    }

    public String person(String name, int age, String courseGrade, String college) {
        return name + " " + age+" "+courseGrade+" "+college;

    }
}

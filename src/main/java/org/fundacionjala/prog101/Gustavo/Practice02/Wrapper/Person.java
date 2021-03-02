package Wrapper;

public class Person {
    String name;
    Age age;

    Person(String name, int age) {
        this.name = name;
        this.age = new Age(age);
    }
}

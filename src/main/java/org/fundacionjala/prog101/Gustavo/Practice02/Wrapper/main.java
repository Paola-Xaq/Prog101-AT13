package Wrapper;

public class main {
    public static void main(String[] args) {
        Age AgeCarlos = new Age(25);
        System.out.println(AgeCarlos.StageLife());
        System.out.println(AgeCarlos.CanVote());
        System.out.println(AgeCarlos.YearBorn());

        int edad = AgeCarlos.getValue();
        System.out.println(edad);
    }
}

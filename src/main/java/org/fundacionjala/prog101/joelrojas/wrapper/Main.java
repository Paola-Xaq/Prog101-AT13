package wrapper;

public class Main {
    public static void main(String[] args) {
        Chars newChar = new Chars('c');
        System.out.println("========");
        System.out.println(newChar);
        System.out.println("========");

        newChar.setChar('z');
        System.out.println("========");
        System.out.println(newChar);
        System.out.println("========");

        char c = newChar.getChar();
        System.out.println("===============================");
        System.out.println("char value: "  + c + " ; wrapper value: " + newChar.getChar());
        System.out.println("===============================");
    }
}

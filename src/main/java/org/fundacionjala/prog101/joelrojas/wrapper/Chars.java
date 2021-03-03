package wrapper;

public class Chars {
    char variable;

    public Chars(char character) {
        variable = character;
    }

    public String changeToString() {
        return "" + variable;
    }

    public char getChar() {
        return variable;
    }

    public void setChar(char var) {
        variable = var;
    }

    @Override  
    public String toString() {  
        return "" + variable;  
    }  
}

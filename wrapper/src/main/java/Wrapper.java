public class Wrapper {
    private char i;
    Wrapper(){}
    Wrapper(char i){
        this.i = i;
    }
    public char getValue(){
        return i;
    }
    public void setValue(char i){
        this.i = i;
    }
    @Override
    public String toString() {
        return Character.toString(i);
    }
}

public class Figure {
    String type;

    public Figure(String type) {
        this.type = type;
    }

    public double getArea() {
        return 0;
    }
    public void draw() { }

    @Override
    public String toString() {
        return "Figure{" +
                "type='" + type + '\'' +
                '}';
    }
}
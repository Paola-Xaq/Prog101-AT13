public class Triangle extends Figure{
    int base;
    int height;

    Triangle(int base, int height) {
        super("Triangle");
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea() {
        return base * height / 2;
    }

    @Override
    public void draw() {
        for (int i = 0; i < height; i++) {
            String str = "*";
            String repeated = str.repeat(i + 1);
            System.out.println(repeated);
        }
    }
}

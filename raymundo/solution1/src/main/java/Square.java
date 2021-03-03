public class Square extends Figure{
    int side;

    Square(int side) {
        super("Square");
        this.side = side;
    }

    @Override
    public double getArea() {
        return Math.pow(side, 2);
    }

    @Override
    public void draw() {
        for (int i = 0; i < side; i++) {
            for (int j = 0; j < side; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}

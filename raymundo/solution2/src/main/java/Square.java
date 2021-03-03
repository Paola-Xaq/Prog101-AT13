public class Square extends PlaneFigure{
    int side;

    Square(int side) {
        super("Square");
        this.side = side;
    }

    @Override
    public double getArea() {
        return super.getArea(side, side);
    }

    @Override
    public void draw() {
        super.draw(side, side);
    }
}

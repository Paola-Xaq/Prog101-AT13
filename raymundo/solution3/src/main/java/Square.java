public class Square extends Figure{
    PlaneFigure planeFigure;
    int side;

    Square(int side) {
        super("Square");
        this.side = side;
    }

    public double getArea() {
        planeFigure = new PlaneFigure();
        return planeFigure.getArea(side, side);
    }

    public void draw() {
        planeFigure = new PlaneFigure();
        planeFigure.draw(side, side);
    }
}

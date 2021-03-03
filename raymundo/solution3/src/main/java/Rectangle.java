public class Rectangle extends Figure{
    PlaneFigure planeFigure;
    int height;
    int base;

    Rectangle(int base, int height) {
        super("Rectangle");
        this.base = base;
        this.height = height;
    }

    public double getArea() {
        planeFigure = new PlaneFigure();
        return planeFigure.getArea(height, base);
    }

    public void draw() {
        planeFigure = new PlaneFigure();
        planeFigure.draw(height, base);
    }
}

public class Rectangle extends PlaneFigure{
    int base;
    int height;

    Rectangle(int base, int height) {
        super("Rectangle");
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea() {
        return super.getArea(height, base);
    }

    @Override
    public void draw() {
        super.draw(height, base);
    }
}

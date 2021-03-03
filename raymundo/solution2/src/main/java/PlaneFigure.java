public class PlaneFigure extends Figure{
    public PlaneFigure(String type) {
        super(type);
    }

    public double getArea(int a, int b) {
        return a * b;
    }

    public void draw(int a, int b) {
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}

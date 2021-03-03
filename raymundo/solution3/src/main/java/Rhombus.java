public class Rhombus extends Figure {
    int majorDiagonal;
    int minorDiagonal;

    Rhombus(int majorDiagonal, int minorDiagonal) {
        super("Rhombus");
        this.majorDiagonal = majorDiagonal;
        this.minorDiagonal = minorDiagonal;
    }

    @Override
    public double getArea() {
        return majorDiagonal * minorDiagonal / 2;
    }

    @Override
    public void draw() {
        System.out.println("    *");
        System.out.println("  * * *");
        System.out.println("* * * * *");
        System.out.println("  * * *");
        System.out.println("    *");
    }
}

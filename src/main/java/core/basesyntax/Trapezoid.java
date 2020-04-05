package core.basesyntax;

public class Trapezoid extends Shape {
    private double lengthA;
    private double lengthB;
    private double height;

    public Trapezoid(double lengthA, double lengthB,
                     double height, String color) {
        super(color);
        this.lengthA = lengthA;
        this.lengthB = lengthB;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println(String.format(
                "Shape: trapezoid, area: %.2f, height: %.2f, color: %s"
                , getArea(), getHeight(), getColor()));
    }

    @Override
    public double getArea() {
        return (lengthA + lengthB) / 2 * height;
    }

    public double getHeight() {
        return height;
    }
}

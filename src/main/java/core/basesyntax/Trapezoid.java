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
    public String draw() {
        return "Shape: trapezoid, area: " + area()
                + ", height: " + height()
                + ", color: " + getColor();
    }

    @Override
    public double area() {
        return (lengthA + lengthB) / 2 * height;
    }

    public double height() {
        return height;
    }
}

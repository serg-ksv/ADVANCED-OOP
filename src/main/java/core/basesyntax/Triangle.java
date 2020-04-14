package core.basesyntax;

public class Triangle extends Shape {
    private double lengthA;
    private double lengthB;
    private double lengthC;

    public Triangle(double lengthA, double lengthB,
                    double lengthC, Color color) {
        super(color);
        this.lengthA = lengthA;
        this.lengthB = lengthB;
        this.lengthC = lengthC;
    }

    @Override
    public void draw() {
        System.out.println(String.format(
                "Shape: triangle, area: %.2f, perimeter: %.2f, color: %s",
                getArea(), getPerimeter(), getColor().toString().toLowerCase()));
    }

    @Override
    public double getArea() {
        double s = (lengthA + lengthB + lengthC) / 2;
        return Math.sqrt(s * (s - lengthA) * (s - lengthB) * (s - lengthC));
    }

    public double getPerimeter() {
        return lengthA + lengthB + lengthC;
    }
}

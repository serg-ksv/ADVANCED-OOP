package core.basesyntax;

public class Triangle extends Shape {
    private double lengthA;
    private double lengthB;
    private double lengthC;

    public Triangle(double lengthA, double lengthB,
                    double lengthC, String color) {
        super(color);
        this.lengthA = lengthA;
        this.lengthB = lengthB;
        this.lengthC = lengthC;
    }

    @Override
    public String draw() {
        return "Shape: triangle, area: " + area()
                + ", perimeter: " + perimeter()
                + ", color: " + getColor();
    }

    @Override
    public double area() {
        double s = (lengthA + lengthB + lengthC) / 2;
        return Math.sqrt(s * (s - lengthA) * (s - lengthB) * (s - lengthC));
    }

    public double perimeter() {
        return lengthA + lengthB + lengthC;
    }
}

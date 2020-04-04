package core.basesyntax;

public class Square extends Shape {
    private double length;

    public Square(double length, String color) {
        super(color);
        this.length = length;
    }

    @Override
    public String draw() {
        return "Shape: square, area: " + area()
                + ", length: " + length()
                + ", color: " + getColor();
    }

    @Override
    public double area() {
        return length * length;
    }

    public double length() {
        return length;
    }
}

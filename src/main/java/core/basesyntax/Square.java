package core.basesyntax;

public class Square extends Shape {
    private double length;

    public Square(double length, String color) {
        super(color);
        this.length = length;
    }

    @Override
    public void draw() {
        System.out.println(String.format(
                "Shape: square, area: %.2f, length: %.2f, color: %s"
                , getArea(), getLength(), getColor()));
    }

    @Override
    public double getArea() {
        return length * length;
    }

    public double getLength() {
        return length;
    }
}

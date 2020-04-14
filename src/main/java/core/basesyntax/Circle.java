package core.basesyntax;

public class Circle extends Shape {
    private double radius;

    public Circle(double radius, Color color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println(String.format(
                "Shape: circle, area: %.2f, diameter: %.2f, color: %s",
                getArea(), getDiameter(), getColor().toString().toLowerCase()));
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double getDiameter() {
        return radius * 2;
    }
}

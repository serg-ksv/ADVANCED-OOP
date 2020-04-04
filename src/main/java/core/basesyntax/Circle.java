package core.basesyntax;

public class Circle extends Shape {
    private double radius;

    public Circle(double radius, String color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public String draw() {
        return "Shape: circle, area: " + area()
                + ", diameter: " + diameter()
                + ", color: " + getColor();
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double diameter() {
        return radius * 2;
    }
}

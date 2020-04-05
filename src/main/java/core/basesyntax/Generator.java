package core.basesyntax;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Generator {
    public static final int MIN_VALUE = 1;
    public static final int MAX_VALUE = 20;

    public static Shape generateShape() {
        Shape generatedShape = new Circle(1, "black");
        String[] shapes = {"circle", "square", "triangle", "trapezoid"};
        String[] colors = {"red", "green", "blue", "black", "white", "yellow"};
        String randomShape = shapes[new Random().nextInt(shapes.length)];
        String randomColor = colors[new Random().nextInt(colors.length)];
        switch (randomShape) {
            case "circle":
                double radius = new Random().nextInt((MAX_VALUE - MIN_VALUE) + 1) + MIN_VALUE;
                generatedShape = new Circle(radius, randomColor);
                break;
            case "square":
                double length = new Random().nextInt((MAX_VALUE - MIN_VALUE) + 1) + MIN_VALUE;
                generatedShape = new Square(length, randomColor);
                break;
            case "triange":
                double lengthA = new Random().nextInt((MAX_VALUE - MIN_VALUE) + 1) + MIN_VALUE;
                double lengthB = new Random().nextInt((MAX_VALUE - MIN_VALUE) + 1) + MIN_VALUE;
                double lengthC = new Random().nextInt((MAX_VALUE - MIN_VALUE) + 1) + MIN_VALUE;
                generatedShape = new Triangle(lengthA, lengthB, lengthC, randomColor);
                break;
            case "trapezoid":
                double sideA = new Random().nextInt((MAX_VALUE - MIN_VALUE) + 1) + MIN_VALUE;
                double sideB = new Random().nextInt((MAX_VALUE - MIN_VALUE) + 1) + MIN_VALUE;
                double height = new Random().nextInt((MAX_VALUE - MIN_VALUE) + 1) + MIN_VALUE;
                generatedShape = new Trapezoid(sideA, sideB, height, randomColor);
        }
        return generatedShape;
    }

    public static List generateListOfShapes(int min, int max) {
        List<Shape> listOfShapes = new ArrayList<>();
        int randomInt = new Random().nextInt((max - min) + 1) + min;
        for (int i = 0; i < randomInt; i++) {
            listOfShapes.add(generateShape());
        }
        return listOfShapes;
    }
}

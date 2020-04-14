package core.basesyntax;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Generator {
    public static final int MIN_VALUE = 1;
    public static final int MAX_VALUE = 20;

    public static Shape generateShape() {
        Shape generatedShape = new Circle(1, Color.BLACK);
        ShapeEnum randomShape = ShapeEnum.values()[new Random().nextInt(ShapeEnum.values().length)];
        Color randomColor = Color.values()[new Random().nextInt(Color.values().length)];
        switch (randomShape) {
            case CIRCLE:
                double radius = generateValue();
                generatedShape = new Circle(radius, randomColor);
                break;
            case SQUARE:
                double length = generateValue();
                generatedShape = new Square(length, randomColor);
                break;
            case TRIANGLE:
                double lengthA = generateValue();
                double lengthB = generateValue();
                double lengthC = generateValue();
                generatedShape = new Triangle(lengthA, lengthB, lengthC, randomColor);
                break;
            case TRAPEZOID:
                double sideA = generateValue();
                double sideB = generateValue();
                double height = generateValue();
                generatedShape = new Trapezoid(sideA, sideB, height, randomColor);
                break;
            default:
                return generatedShape;
        }
        return generatedShape;
    }

    public static List<Shape> generateListOfShapes(int min, int max) {
        List<Shape> listOfShapes = new ArrayList<>();
        int randomInt = new Random().nextInt((max - min) + 1) + min;
        for (int i = 0; i < randomInt; i++) {
            listOfShapes.add(generateShape());
        }
        return listOfShapes;
    }

    private static double generateValue() {
        return new Random().nextInt((MAX_VALUE - MIN_VALUE) + 1) + MIN_VALUE;
    }
}

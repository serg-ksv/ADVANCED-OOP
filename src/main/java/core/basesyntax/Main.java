package core.basesyntax;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(3, "red");
        Square square = new Square(5, "black");
        Trapezoid trapezoid = new Trapezoid(2,3,4,"yellow");
        Triangle triangle = new Triangle(5,6,3, "blue");

        List<Shape> listOfShapes = new ArrayList<>();
        Collections.addAll(listOfShapes, circle, square, trapezoid, triangle);
        Collections.shuffle(listOfShapes);
        int random = (int) (Math.random() * 4) + 1;
        for (Shape shape : listOfShapes.subList(0, random)) {
            System.out.println(shape.draw());
        }
    }
}

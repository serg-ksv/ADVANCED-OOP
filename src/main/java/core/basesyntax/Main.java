package core.basesyntax;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Shape> listOfShapes = Generator.generateListOfShapes(1, 50);
        for (Shape shape : listOfShapes) {
            shape.draw();
        }
    }
}

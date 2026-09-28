package service;

import javafx.scene.paint.Color;
import model.shapes.RectangleShape;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ShapeServiceTest {

    @Test
    void managesTheShapeCollection() {
        ShapeService service = new ShapeService();
        RectangleShape rectangle = new RectangleShape(
                10, 20, 30, 40, Color.BLUE, 2
        );

        service.addShape(rectangle);
        assertEquals(List.of(rectangle), service.getShapes());

        service.removeShape(rectangle);
        assertTrue(service.getShapes().isEmpty());
    }

    @Test
    void replacesAndClearsTheShapeCollection() {
        ShapeService service = new ShapeService();
        RectangleShape rectangle = new RectangleShape(
                0, 0, 10, 10, Color.BLACK, 1
        );

        service.setShapes(List.of(rectangle));
        assertEquals(1, service.getShapes().size());

        service.clearShapes();
        assertTrue(service.getShapes().isEmpty());
    }
}

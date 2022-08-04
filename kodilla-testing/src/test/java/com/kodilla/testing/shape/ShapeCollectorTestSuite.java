package com.kodilla.testing.shape;

import org.junit.jupiter.api.*;

@DisplayName("Shape Test Suite")
public class ShapeCollectorTestSuite {

    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("Beginning of tests...");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("All tests finished.");
    }

    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }
}
    @Nested
    @DisplayName("Tests of adding and deleting figures")
    class TestingBasics{

    @Test
        void testAddingShape() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape circle = new Circle(17);
        //When
        boolean result = shapeCollector.addFigure(circle);
        //Then
        Assertions.assertTrue(result);
    }

    @Test
        void testRemovingShape(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape triangle = new Triangle(12,22);
        shapeCollector.addFigure(triangle);
        //When
        boolean result = shapeCollector.removeFigure(triangle);
        //Then
        Assertions.assertTrue(result);
        }
    }

    @Nested
    @DisplayName("More advanced method testing")
    class AdvancedMethodTesting{

    @Test
    void testGetFigure(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape firstShape = new Circle(2);
        Shape secondShape = new Circle(22);
        shapeCollector.addFigure(firstShape);
        shapeCollector.addFigure(secondShape);
        //When
        Shape shape;
        shape = shapeCollector.getFigure(0);
        //Then
        Assertions.assertEquals(firstShape, shape);

    }

    @Test
    void testShowFigure(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape firstShape = new Square(2);
        Shape secondShape = new Circle(22);
        shapeCollector.addFigure(firstShape);
        shapeCollector.addFigure(secondShape);
        //When
        String shapes = "SquareCircle";
        String result = shapeCollector.showFigures();
        //Then
        Assertions.assertEquals(shapes, result);

    }

}






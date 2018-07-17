package com.kodilla.testing.shape;

        import org.junit.*;

        import java.util.ArrayList;

        import static org.junit.Assert.*;

//Test suite for classes of ShapeCollector
public class ShapeCollectorTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    public void testAddFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();

        //When
        shapeCollector.addFigure(new Circle(2));

        //Then
        assertEquals(2, shapeCollector.addFigure(new Circle(2)));
    }

    @Test
    public void testRemoveFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle = new Circle(6);
        Square square = new Square(6);
        Triangle triangle = new Triangle(6, 6);
        shapeCollector.addFigure(circle);
        shapeCollector.addFigure(square);
        shapeCollector.addFigure(triangle);

        //When
        boolean result = shapeCollector.removeFigure(triangle);

        //Then
        assertTrue(result);
    }

    @Test
    public void testGetFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();

        //When
        shapeCollector.addFigure(new Circle(2));
        shapeCollector.addFigure(new Square(2));

        String figure1 = shapeCollector.getFigure(0);
        String figure2 = shapeCollector.getFigure(1);

        //Then
        assertEquals("Circle", figure1);
        assertEquals("Square", figure2);
    }
    @Test
    public void showFigures() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();

        //When
        shapeCollector.addFigure(new Circle(2));
        shapeCollector.addFigure(new Square(2));
        shapeCollector.addFigure(new Triangle(2, 3));

        String figure1 = shapeCollector.getFigure(0);
        String figure2 = shapeCollector.getFigure(1);
        String figure3 = shapeCollector.getFigure(2);

        //Then
        assertEquals("Circle", figure1);
        assertEquals("Square", figure2);
        assertEquals("Triangle", figure3);
    }
}
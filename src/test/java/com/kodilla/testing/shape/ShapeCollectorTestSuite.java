package com.kodilla.testing.shape;

import org.junit.*;

import java.util.ArrayList;

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
        ShapeCollector shapeCollector = new ShapeCollector(new Circle(2));

        //When
        ArrayList<Shape> shapeCollectionTest = new ArrayList<Shape>();
        shapeCollector.addFigure(new Circle(2), shapeCollectionTest);

        //Then
        Assert.assertEquals(1, shapeCollectionTest.size());
    }

    @Test
    public void testRemoveFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector(new Circle(2));

        //When
        ArrayList<Shape> shapeCollectionTest = new ArrayList<Shape>();

        shapeCollector.addFigure(new Circle(2), shapeCollectionTest);
        shapeCollector.removeFigure(new Circle(2), shapeCollectionTest);

        //Then
        Assert.assertTrue(shapeCollectionTest.isEmpty());
    }

     @Test
    public void testGetFigure() {
        //Given
         ShapeCollector shapeCollector = new ShapeCollector(new Circle(2));

         //When
         ArrayList<Shape> shapeCollectionTest = new ArrayList<Shape>();
         shapeCollector.addFigure(new Circle(2), shapeCollectionTest);
         Shape figure1 = shapeCollector.getFigure(0, shapeCollectionTest);
         String figure1Name = figure1.getShapeName();

         //Then
         Assert.assertFalse(shapeCollectionTest.isEmpty());
         Assert.assertEquals(1, shapeCollectionTest.size());
         Assert.assertEquals("Circle", figure1Name);
     }
    @Test
    public void showFigures() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector(new Circle(2));

        //When
        ArrayList<Shape> shapeCollectionTest = new ArrayList<Shape>();
        shapeCollector.addFigure(new Circle(2), shapeCollectionTest);
        shapeCollector.addFigure(new Square(2), shapeCollectionTest);
        shapeCollector.addFigure(new Triangle(2, 3), shapeCollectionTest);

        Shape figure1 = shapeCollector.getFigure(0, shapeCollectionTest);
        String figure1Name = figure1.getShapeName();
        Shape figure2 = shapeCollector.getFigure(1, shapeCollectionTest);
        String figure2Name = figure2.getShapeName();
        Shape figure3 = shapeCollector.getFigure(2, shapeCollectionTest);
        String figure3Name = figure3.getShapeName();

        //Then
        Assert.assertFalse(shapeCollectionTest.isEmpty());
        Assert.assertEquals(3, shapeCollectionTest.size());

        Assert.assertEquals("Circle", figure1Name);
        Assert.assertEquals("Square", figure2Name);
        Assert.assertEquals("Triangle", figure3Name);
    }
}
package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector{

    private Shape shape;
    public ArrayList<Shape> shapeCollection = new ArrayList<Shape>();

    public ShapeCollector(Shape shape) {
        this.shape = shape;
    }

    void addFigure(Shape shape, ArrayList<Shape> shapeCollection){
        shapeCollection.add(shape);
    }

    void removeFigure(Shape shape, ArrayList<Shape> shapeCollection ){
        shapeCollection.remove(shapeCollection.size()-1);
    }

    public Shape getFigure(int n, ArrayList<Shape> shapeCollection){
        return shapeCollection.get(n);
    }

    public void showFigures() {
        for(Shape shape: shapeCollection) {
            System.out.println(shape);
        }
    }
}

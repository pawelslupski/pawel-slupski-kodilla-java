package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector{

    public ArrayList<Shape> shapeCollection = new ArrayList<Shape>();

    int addFigure(Shape shape){
        shapeCollection.add(shape);
        return shapeCollection.size();
    }

    boolean removeFigure(Shape shape){
        boolean result;
        if (shapeCollection.contains(shape)){
            shapeCollection.remove(shape);
            result = true;
        } else { result = false;}
        return result;
    }

    public String getFigure(int n){
        return shapeCollection.get(n).getShapeName();
    }

    public void showFigures() {
        for(Shape shape: shapeCollection) {
            System.out.println(shape);
        }
    }
}

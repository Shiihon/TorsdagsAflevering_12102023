package Task_04;

import java.util.ArrayList;

public class ShapeBuilder {
    ArrayList<Shape> shapeList = new ArrayList<>();

    public void addShape(Shape shape){
        shapeList.add(shape);
    }

    public double getTotalArea(ArrayList<Shape> shapeList) {
        double total = 0;
        for(Shape s : shapeList) {
            total += s.getArea();
        }
        return total;
    }
}

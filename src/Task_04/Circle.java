package Task_04;

public class Circle implements Shape{
    private double radius;

    public Circle (double radius){
        this.radius = radius;
    }
    @Override
    public double getArea() {
       double totalAreal = 3.14 * (radius * radius);

       return totalAreal;
    }

    public double getRadius() {
        return radius;
    }
}

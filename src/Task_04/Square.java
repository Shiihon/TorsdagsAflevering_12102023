package Task_04;

public class Square implements Shape{
    private double length;
    private double width;


    public Square(double length, double width){
        this.length = length;
        this.width = width;
    }
    @Override
    public double getArea() {
        double totalAreal = length * width;

        return totalAreal;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }
}


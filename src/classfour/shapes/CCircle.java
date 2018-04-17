package classfour.shapes;

public class CCircle extends CShape {
    private double radius;

    public CCircle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return radius * radius * 3.1415926;
    }

    @Override
    public String toString() {
        return "this circle's area is :" + getArea();
    }
}

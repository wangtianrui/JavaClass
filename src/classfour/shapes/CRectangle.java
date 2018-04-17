package classfour.shapes;

public class CRectangle extends CShape {
    private double wid;
    private double height;

    public CRectangle(double wid, double height) {
        this.wid = wid;
        this.height = height;
    }

    @Override
    public double getArea() {
        return wid * height;
    }

    @Override
    public String toString() {
        return "this rectangle's area is :" + getArea();
    }
}

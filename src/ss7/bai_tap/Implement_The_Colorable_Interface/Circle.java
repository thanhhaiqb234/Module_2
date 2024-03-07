package ss7.bai_tap.Implement_The_Colorable_Interface;

public class Circle implements Resizeable {
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return (this.radius * this.radius)*3.14;
    }

    @Override
    public void resize(double percent) {
      this.radius = getRadius() + (getRadius() * percent/100);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                "area=" + getArea() +
                '}';
    }
}

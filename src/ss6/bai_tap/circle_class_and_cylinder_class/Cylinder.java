package ss6.bai_tap.circle_class_and_cylinder_class;

public class Cylinder extends Circle{
    private float height;

    public Cylinder(float radius, String color, float height) {
        super(radius, color);
        this.height = height;
    }

    public Cylinder(float height) {
        this.height = height;
    }

    public float getHeight(){
        return height;
    }
    public void setHeight(float height) {
       this.height = height;
    }
    public double getVolume(){
        return getAcreage()*height;
    }
    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height +
                ", radius=" + super.getRadius() +
                ", color='" + super.getColor() + '\'' +
                '}';
    }
}

package ss7.bai_tap.Lmplement_The_Resizeable_Interface;

public class Spuare extends Shape implements Colorable {
    private double width;

    public Spuare() {

    }

    public Spuare(double width,String color , boolean filled) {
        super(color,filled);
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "Spuare{" +
                super.toString() +
                "width=" + width +
                '}';
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides..");
    }
}

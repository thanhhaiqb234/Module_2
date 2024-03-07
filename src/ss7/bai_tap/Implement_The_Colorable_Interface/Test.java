package ss7.bai_tap.Implement_The_Colorable_Interface;

public class Test {
    public static void main(String[] args) {
        Circle circle=new Circle(5);
        System.out.println(circle);
        System.out.println(circle.getRadius());
        circle.resize(50);
        System.out.println(circle.getRadius());
    }
}

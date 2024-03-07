package ss6.bai_tap.class_point_and_moveablepoint;

public class Test {
    public static void main(String[] args) {
        MoveablePoint moveablePoint = new MoveablePoint(1,11,32,25);
        System.out.println(moveablePoint);
        System.out.println(moveablePoint.move());
        System.out.println(moveablePoint.move());
        System.out.println(moveablePoint.move());
        System.out.println(moveablePoint.move());
    }
}

package ss7.bai_tap.Lmplement_The_Resizeable_Interface;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[5];
        shapes[0] = new Circle(5,"blue",true);
        shapes[1] = new Circle(6,"blue",false);
        shapes[2] = new Circle(6,"red",true);
        shapes[3] = new Spuare(9,"blue",false);
        shapes[4] = new Circle(6,"blue",false);
        for (Shape s: shapes) {
            if (s instanceof Spuare){
                ((Spuare) s).howToColor();
            }else {
                System.out.println(s.toString());
            }
        }
    }
}

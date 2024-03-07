package ss5.bai_tap.access_modifier;

import java.util.Scanner;

public class Circle {
    public double radius = 1.0;
    private String color;

    public static String color() {
        return "red";
    }

    public static double radius(double radius) {
        return radius;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public double getArea() {
        return this.radius * this.radius * 3.14;
    }

    class TestCircle {
        Scanner circle = new Scanner(System.in);

    }


}
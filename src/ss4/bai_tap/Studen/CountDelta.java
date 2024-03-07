package ss4.bai_tap.Studen;

import java.util.Scanner;

public class CountDelta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập A : ");
        double a = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập B : ");
        double b = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập C : ");
        double c = Double.parseDouble(scanner.nextLine());
        QuadraticEquation quadraticEquation = new QuadraticEquation();
        quadraticEquation.setA(a);
        quadraticEquation.setB(b);
        quadraticEquation.setC(c);
        double delta = quadraticEquation.getDiscriminant();
        if (delta > 0){
            System.out.println("Phương trình có hai nghiệm : R1 = " + quadraticEquation.getRoot1() + " R2 " + quadraticEquation.getRoot2());
        } else if (delta == 0) {
            System.out.println("Phương trình có một nghiệm : " + quadraticEquation.getRoot1());
        }else {
            System.out.println("The equation has no roots");
        }
    }
}

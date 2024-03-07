package ss15.bai_tap;

import java.util.Scanner;

public class CheckException {
    public static void main(String[] arge) {
        boolean flag = true;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhập cạnh A : ");
            int number1 = scanner.nextInt();
            System.out.println("Nhập cạnh B : ");
            int number2 = scanner.nextInt();
            System.out.println("Nhập cạnh C : ");
            int number3 = scanner.nextInt();
            flag = true;
            try {
                if (number1 < 0 || number2 < 0 || number3 < 0) {
                    throw new TriangleException("Nhập sai cạnh ");
                }
                flag=false;
            } catch (TriangleException e) {
                System.out.println(e.getMessage());
                System.out.println("Nhập lại cạnh : ");

            }
            flag = true;
            try {
                if (number1 + number2 <= number3 || number2 + number3 <= number1 || number3 + number1 <= number2){
                    throw new TriangleException("Nhập sai cạnh tam giác");
                }
                flag =false;
            } catch (TriangleException e) {
                System.out.println(e.getMessage());
                System.out.println("Vui lòng nhập lại : ");
            }
        } while (flag);
    }
}


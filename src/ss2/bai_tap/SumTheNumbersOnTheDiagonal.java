package ss2.bai_tap;

import java.util.Scanner;

public class SumTheNumbersOnTheDiagonal {
    public static void main(String[] args) {
        int lengthRow;
        int lengthColumn;
        int total = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng hàng : ");
        lengthRow = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập số lượng cột : ");
        lengthColumn = Integer.parseInt(scanner.nextLine());
        int[][] array = new int[lengthRow][lengthColumn];
        for (int i = 0; i < lengthRow; i++) {
            array[i] = new int[lengthColumn];
            for (int j = 0; j < lengthColumn; j++) {
                System.out.println("Nhập các phần tử vào mảng :[" + j + "][" + i + "] :");
                array[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }
        for (int i = 0; i < lengthRow; i++) {
            for (int j = 0; j < lengthColumn; j++) {
                System.out.println(array[i][j]);
            }
        }
        for (int i = 0; i < array.length; i++) {
            total += array[i][i];
        }
        System.out.println("Tổng đường chéo chính của ma trận là  = " + total);
    }

}

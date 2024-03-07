package ss2.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class SumTheNumbersInASpecifiedColumn {
    public static void main(String[] args) {
        int total = 0;
        int input;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số cột mà bạn cần tính tổng : ");
        input = Integer.parseInt(scanner.nextLine());
        int array[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 20, 30}, {40, 50, 60}};
        for (int i = 0; i < array.length; i++) {
            total += array[i][input];
        }
        System.out.println(total);
    }
}

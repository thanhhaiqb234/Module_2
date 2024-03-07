package ss2.bai_tap;

import sun.security.util.Length;

import java.util.Arrays;
import java.util.Scanner;

public class LargestElementInATwoDimensionalArray {
    public static void main(String[] args) {
        int lengthRow;
        int lengthColumn;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng hàng : ");
        lengthRow = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập số lượng cột : ");
        lengthColumn = Integer.parseInt(scanner.nextLine());
        int[][] array = new int[lengthRow][lengthColumn];
        for (int i = 0; i < lengthRow; i++) {
            array[i] = new int[lengthColumn];
            for (int j = 0; j < lengthColumn; j++) {
                System.out.println("Nhập các phần tử vào mảng : " + j + "mảng" + i + ":");
                array[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }
        for (int i = 0; i < lengthRow; i++) {
            for (int j = 0; j < lengthColumn; j++) {
                System.out.println(array[i][j]);
            }
        }
        int max = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > max){
                    max = array[i][j];
                }
            }
        }
        System.out.print("Phần tử lớn nhất có trong mảng là : "+max);
    }

}

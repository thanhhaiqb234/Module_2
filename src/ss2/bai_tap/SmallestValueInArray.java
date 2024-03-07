package ss2.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class SmallestValueInArray {
    public static void main(String[] args) {
        int lengthRow;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập độ dài của mảng : ");
        lengthRow = Integer.parseInt(scanner.nextLine());
        int array[] = new int[lengthRow];
        for (int i = 1; i < lengthRow; i++) {
            System.out.println("Nhập các phần tử thứ :" + i + ":");
            array[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(array));
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min){
                min = array[i];
            }
        }
        System.out.println(min);
    }
}

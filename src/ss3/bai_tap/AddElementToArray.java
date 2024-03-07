package ss3.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class AddElementToArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbers[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("Nhập số để thêm vào mảng :");
        int numb = scanner.nextInt();
        System.out.println("Nhập vị trí cần thêm: ");
        int index = scanner.nextInt();
        if (index <= -1 || index >= numbers.length - 1) {
            System.out.println("Không thêm được vào mảng");
        } else {
            for (int i = 0; i < numbers.length; i++) {
                if (index == i) {
                    for (int j = numbers.length - 1; j > i; j--) {
                        numbers[j] = numbers[j - 1];
                    }
                    numbers[index] = numb;
                    i++;
                }
            }
        }
        System.out.println("Mảng sau khi thêm " + Arrays.toString(numbers));
    }
}

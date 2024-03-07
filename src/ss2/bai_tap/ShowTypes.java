package ss2.bai_tap;

import java.util.Scanner;

public class ShowTypes {
    public static void main(String[] arge) {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        do {
            System.out.println("1. hinh chu nhat\n" +
                    "2.  Tam giác vuông, có cạnh góc vuông ở botton-left\n" +
                    "3. Tam giác vuông, có cạnh góc vuông ở top-left  \n" +
                    "4. thoat");
            System.out.println("Nhập Số vào");
            Integer input = Integer.parseInt(scanner.nextLine());
            switch (input) {
                case 1:
                   int length1 = 7;
                   int width1 = 3;
                    for (int i = 0; i < width1; i++) {
                        for (int j = 0; j <= length1 ; j++) {
                            System.out.print("*" + " ");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    int length2 = 1;
                    while (length2 <= 5){
                        for (int i = 1; i <= length2; i++) {
                            for (int j = 0; j < length2; j++) {
                                System.out.print("*" + " ");
                                break;
                            }
                        }
                        System.out.println();
                        length2++;
                    }
                    break;
                case 3:
                    int length3 = 5;
                    while (length3 >= 0){
                        for (int i = 0; i < length3; i++) {
                            for (int j = 0; j < length3; j++) {
                                System.out.print("*" + " ");
                            }
                            System.out.println();
                            length3--;
                        }
                    }
                    break;
                case 4:
                    flag = false;
                    break;
                default:
                    System.out.println("Nhập sai mời nhập lại!");
                    break;
            }

        } while (flag);

    }
}

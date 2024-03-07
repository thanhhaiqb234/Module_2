package ss1.bai_tap;

import java.util.Scanner;

public class UngDungDocSoThanhChu {
    public static void main(String[] arge) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số vào đây : ");
        Integer nhap = Integer.parseInt(scanner.nextLine());

        if (nhap <= 10){
            doiChu1(nhap);
        } else if (nhap <= 20) {
            doiChu2(nhap);
        } else if (nhap <= 100) {
            doiChu3(nhap);
        }

    }

    public static void doiChu1(int num) {
        switch (num) {
            case 1:
                System.out.print("one");
                break;
            case 2:
                System.out.print("two");
                break;
            case 3:
                System.out.print("three");
                break;
            case 4:
                System.out.print("four");
                break;
            case 5:
                System.out.print("five");
                break;
            case 6:
                System.out.print("six");
                break;
            case 7:
                System.out.print("seven");
                break;
            case 8:
                System.out.print("eight");
                break;
            case 9:
                System.out.print("nine");
                break;
            case 10:
                System.out.print("ten");
                break;
        }
    }

    public static void doiChu2(int num) {
        if (num == 11) {
            System.out.print("eleven");
        } else if (num == 12) {
            System.out.println("twelve");
        } else if (num < 20) {
            doiChu1(num % 10);
            System.out.print(" " + "teen");
        } else if (num == 20) {
            System.out.print("twenty");
        }
    }

    public static void doiChu3(int num) {
        if (num <= 29) {
            System.out.print("twenty" + " ");
            doiChu1(num % 10);
        } else if (num == 30) {
            System.out.print("thirty");
        } else if (num <= 39) {
            System.out.print("thirty" + " ");
            doiChu1(num % 10);
        } else if (num == 40) {
            System.out.print("forty");
        } else if (num <= 49) {
            System.out.print("forty" + " ");
            doiChu1(num % 10);
        } else if (num == 50) {
            System.out.print("fifty");
        } else if (num <= 59) {
            System.out.print("fifty" + " ");
            doiChu1(num % 10);
        } else if (num == 60) {
            System.out.print("sixty");
        } else if (num <= 69) {
            System.out.print("sixty" + " ");
            doiChu1(num % 10);
        }else if (num == 70){
            System.out.print("seventy");
        }else if (num <= 79) {
            System.out.print("seventy" + " ");
            doiChu1(num % 10);
        }else if (num == 80){
            System.out.print("eighty");
        }else if (num <= 89) {
            System.out.print("eighty" + " ");
            doiChu1(num % 10);
        }else if (num == 90){
            System.out.print("ninety");
        }else if (num <= 99) {
            System.out.print("ninety" + " ");
            doiChu1(num % 10);
        }else if (num == 100){
            System.out.print("one hundred");
        }
    }
}



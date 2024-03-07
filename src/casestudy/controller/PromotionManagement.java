package casestudy.controller;

import java.util.Scanner;

public class PromotionManagement {
    public void promotionManagement() {
        boolean flag = true;
        FuramaCotroller furamaCotroller = new FuramaCotroller();
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("1: PromotionManagement\n" +
                    "2: Display list customers get voucher\n" +
                    "3: Return main menu");
            String menu = scanner.nextLine();
            switch (menu) {
                case "1":
                    break;
                case "2":
                    break;
                case "3":
                    furamaCotroller.displayMainMenu();
                    break;
                default:
                    System.out.println("");
                    flag = false;
            }
        }while (true);
    }
}

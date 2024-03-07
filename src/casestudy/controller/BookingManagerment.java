package casestudy.controller;

import java.util.Scanner;

public class BookingManagerment {
    public void bookingManagerment(){
        boolean flag = true;
        FuramaCotroller furamaCotroller = new FuramaCotroller();
        Scanner scanner =new Scanner(System.in);
        do {
            System.out.println("1: BookingManagerment\n" +
                    "2: Display list booking\n" +
                    "3: Create new contracts\n" +
                    "4: Display list contracts\n" +
                    "5: Edit contracts\n" +
                    "6: Return main menu");
            String menu = scanner.nextLine();
            switch (menu){
                case "1" :
                    break;
                case "2" :
                    break;
                case "3" :
                    break;
                case "4" :
                    break;
                case "5" :
                    break;
                case "6" :
                    furamaCotroller.displayMainMenu();
                    break;
                default:
                    System.out.println("");
                    flag = false;
            }
        }while (true);
    }
}

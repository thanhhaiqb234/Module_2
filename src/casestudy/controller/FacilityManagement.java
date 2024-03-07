package casestudy.controller;

import java.util.Scanner;

public class FacilityManagement {
    public void facilityManagement(){
        boolean flag = true;
        FuramaCotroller furamaCotroller = new FuramaCotroller();
        Scanner scanner = new Scanner(System.in);
       do {
           System.out.println("1: Display list facility\n" +
                   "2: Add new facility\n" +
                   "3: Display list facility maintenance\n" +
                   "4: Return main menu");
           String menu = scanner.nextLine();
           switch (menu){
               case "1" :
                   break;
               case "2" :
                   break;
               case "3" :
                   break;
               case "4" :
                   furamaCotroller.displayMainMenu();
                   break;
               default:
                   System.out.println("");
                   flag = false;
           }
       }while (true);
    }
}

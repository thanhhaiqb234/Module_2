package casestudy.controller;

import casestudy.service.CustomerService;

import java.util.Scanner;

public class CustomerManagement {
    public void customerManagement(){
        FuramaCotroller furamaCotroller = new FuramaCotroller();
        CustomerService customerService = new CustomerService();
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        do {
            System.out.println("1: Display list customers\n" +
                    "2: Add new customer\n" +
                    "3: Edit customer\n" +
                    "4: Detele customer\n" +
                    "5: Search by name customer\n" +
                    "6: Return main menu");
            String menu = scanner.nextLine();
            switch (menu){
                case "1" :
                    customerService.displayCustomer();
                    break;
                case "2" :
                    customerService.addCustomer();
                    break;
                case "3" :
                    break;
                case "4" :
                    customerService.deteleCustomer();
                    break;
                case "5" :
                    customerService.searchCustomer();
                    break;
                case "6" :
                    return;
                default:
                    System.out.println("");
                    flag = false;
            }

        }while (true);
    }
}

package casestudy2.controller;

import casestudy2.service.CustomerService;

import java.util.Scanner;

public class CustomerManagement {
    private Scanner scanner = new Scanner(System.in);
    private CustomerService customerService = new CustomerService();
    public void displayCustomer(){
        boolean flag = true;
       do {
           System.out.println("1.\tDisplay list customers \n" +
                   "2.\tAdd new customer \n" +
                   "3.\tEdit customer \n" +
                   "4.\tDelete customer \n" +
                   "5.\tSearch by name customer \n" +
                   "6.\tReturn main menu");
           String menu = scanner.nextLine();
           switch (menu){
               case "1" :
                   customerService.displayCustomer();
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
                   break;
               default:
                   System.out.println("Bạn đã chọn sai xin vui lòng chọn lại : ");
                   flag = false;

           }
       }while (!flag);
    }
}

package casestudy2.controller;

import java.util.Scanner;

public class Furama {
    private EmployeeManagement employeeManagement = new EmployeeManagement();
    private CustomerManagement customerManagement = new CustomerManagement();
    private Scanner scanner = new Scanner(System.in);
    public void displayMainMenu(){
        boolean flag = true;
        do {
            System.out.println("1.\tEmployee Management\n" +
                    "2.\tCustomer Management\n" +
                    "3.\tFacility Management \n" +
                    "4.\tBooking Management\n" +
                    "5.\tPromotion Management\n" +
                    "6.\tExit");
            String menu = scanner.nextLine();
            switch (menu){
                case "1" :
                    employeeManagement.display();
                    break;
                case "2" :
                    customerManagement.displayCustomer();
                    break;
                case "3" :
                    break;
                case "4" :
                    break;
                case "5" :
                    break;
                case "6" :
                    System.out.println("Exit");
                    flag = false;
                    break;
                default:
                    System.out.println("* Bạn đã chọn sai xin vui lòng chọn lại *");
                    break;
            }
        }while (!flag);
    }
}

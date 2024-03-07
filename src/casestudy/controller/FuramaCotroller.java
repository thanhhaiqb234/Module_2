package casestudy.controller;

import java.util.Scanner;

public class FuramaCotroller {

    public void displayMainMenu(){
        EmployeeManagement employeeManagement = new EmployeeManagement();
        CustomerManagement customerManagement = new CustomerManagement();
        FacilityManagement facilityManagement = new FacilityManagement();
        BookingManagerment bookingManagerment = new BookingManagerment();
        PromotionManagement promotionManagement = new PromotionManagement();

        Scanner scanner = new Scanner(System.in);
        boolean flag = false;
        do {
            System.out.println("LỰA CHỌN CÁC CHỨA NĂNG TRÊN MENU BAO GỒM : \n" +
                    "1 : Employee Management\n" +
                    "2 : Customer.csv Management\n" +
                    "3 : Facility Management\n" +
                    "4 : Booking Management\n" +
                    "5 : Promotion Management\n" +
                    "6 : Exit");
            String menu = scanner.nextLine();
            switch (menu){
                case "1" :
                    employeeManagement.employeeManagement();
                    flag = true;
                    break;
                case "2" :
                    customerManagement.customerManagement();
                    flag = true;
                    break;
                case "3" :
                    facilityManagement.facilityManagement();
                    flag = true;
                    break;
                case "4" :
                    bookingManagerment.bookingManagerment();
                    flag = true;
                    break;
                case "5" :
                    promotionManagement.promotionManagement();
                    flag = true;
                    break;
                case "6" :
                    System.out.println("Exit");
                    flag = true;
                    break;
                default:
                    System.out.println("Bạn chọn không đúng");
                    flag = false;
            }
        }while (!flag);
    }
}

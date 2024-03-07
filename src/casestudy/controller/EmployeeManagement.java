package casestudy.controller;

import casestudy.service.EmployeeService;

import java.util.Scanner;

public class EmployeeManagement {
    public void employeeManagement(){
        boolean flag = true;
        FuramaCotroller furamaCotroller = new FuramaCotroller();
        EmployeeService employeeService = new EmployeeService();
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("1: Display list employees\n" +
                    "2: Add new employee\n" +
                    "3: Edit employee\n" +
                    "4: Delete employee\n" +
                    "5: Search by name employee\n" +
                    "6: Return main menu");
            String menu = scanner.nextLine();
            switch (menu){
                case "1" :
                    employeeService.displayEmployee();
                    break;
                case "2" :
                    employeeService.addEmployee();
                    break;
                case "3" :
                    break;
                case "4" :
                    employeeService.deteleEmployee();
                    break;
                case "5" :
                    employeeService.searchEmployee();
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

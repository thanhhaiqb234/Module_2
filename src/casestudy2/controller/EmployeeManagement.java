package casestudy2.controller;

import casestudy2.service.EmployeeService;

import java.util.Scanner;

public class EmployeeManagement{
    private Scanner scanner = new Scanner(System.in);
    private EmployeeService employeeService = new EmployeeService();

    public void display(){
        Furama furama = new Furama();
        boolean flag = true;
        do {
            System.out.println("1\tDisplay list employees\n" +
                    "2\tAdd new employee\n" +
                    "3\tEdit employee\n" +
                    "4\tDelete employee\n" +
                    "5\tSearch by name employee\n" +
                    "6\tReturn main menu");
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
                    employeeService.seachEmployee();
                    break;
                case "6" :
                    furama.displayMainMenu();
                    break;
                default:
                    System.out.println("* Bạn đã chọn sai xin vui lòng chọn lại *");
                    break;
            }
        }while (flag);
    }
}

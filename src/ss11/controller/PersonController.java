package ss11.controller;

import ss11.service.StudentService;

import java.util.Scanner;

public class PersonController{
    Scanner scanner = new Scanner(System.in);
    StudentService studentService = new StudentService();
    public void displayMenu(){
        System.out.println("--- Chương trình quản lý sinh viên---");
        boolean flag = true;
        do {
            System.out.println("Chọn chức năng theo số (để tiếp tục)\n" +
                    "1 : Thêm mới giảng viên hoặc học sinh\n" +
                    "2 : Xóa giảng viên hoặc học sinh\n" +
                    "3 : Xem danh sách giảng viên hoặc học sinh \n" +
                    "4 ; Thoát\n" +
                    "Chọn Chức năng : ");
            String choice = scanner.nextLine();
            switch (choice){
                case "1" :
                    studentService.addStudent();
                    break;
                case "2"  :
                    studentService.deleteStudent();
                    break;
                case "3" :
                    studentService.display();
                    break;
                case "4" :
                    flag = false;
                    break;
                default:
                    System.out.println("Bạn chọn sai rồi xin vui lòng chọn lại");
                    flag = true;
            }
        }while (flag);

    }
}

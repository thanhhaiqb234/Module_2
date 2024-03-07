package ss18.bai_tap.controller;

import ss18.bai_tap.repository.StudentRepository;
import ss18.bai_tap.service.StudentService;

import java.util.Scanner;

public class MenuStudent {

    public static void display(){
        StudentService studentService = new StudentService();
        boolean flag = true;
        do {
           Scanner scanner = new Scanner(System.in);
           System.out.println("---CHƯƠNG TRÌNH QUẢN LÝ HỌC SINH---\n" +
                   "1: Thêm mới giảng viên hoặc học sinh\n" +
                   "2: Xóa giảng viên hoặc học sinh\n" +
                   "3: Hiển dang sách giảng viên hoặc học sinh\n" +
                   "4: Tìm kiếm giảng viên hoặc học sinh\n" +
                   "5: Sửa thông tin giảng viên hoặc học sinh\n" +
                   "6 : THOÁT\n" +
                   "BẠN HÃY CHỌN CHỨC NĂNG : ");
           String choi = scanner.nextLine();
                   switch (choi){
                       case "1" :
                           studentService.more();
                           break;
                       case "2" :
                           studentService.detele();
                           break;
                       case "3" :
                           studentService.display();
                           break;
                       case "4" :
                           studentService.search();
                           break;
                       case "5" :
                           System.out.println("them");
                           break;
                       case "6" :
                           System.out.println("thoát");
                           break;
                       default:
                           System.out.println("Bạn nhập sai rồi xin vui lòng nhập lại : ");
                           flag = false;
                   }

       }while (true);
    }
}

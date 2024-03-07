package ss11.service;

import ss11.model.Student;
import ss11.repository.StudentRepository;

import java.util.List;
import java.util.Scanner;

public class StudentService implements IStudentService {
    Scanner scanner = new Scanner(System.in);
    StudentRepository studentRepository = new StudentRepository();

    @Override
    public void display() {
        List<Student> studentList = studentRepository.getStudent();
        for (Student student : studentList) {
            System.out.println(student);
        }
    }

    @Override
    public void addStudent() {

        System.out.println("Thêm Mã học sinh vào");
        String code = scanner.nextLine();
        System.out.println("Thêm tên học sinh vào");
        String name = scanner.nextLine();
        System.out.println("Thêm ngày tháng năm Sinh cho học sinh vào");
        String birthDay = scanner.nextLine();
        boolean flag;
        boolean gender = false;
        do {
            System.out.println("Chọn giới tính học sinh \n" +
                    "1 : Nam \n" +
                    "2 : Nữ \n");

            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    gender = true;
                    flag = false;
                    break;
                case "2":
                    gender = false;
                    flag = false;
                    break;
                default:
                    System.out.println("Mời bạn chọn lại ");
                    flag = true;
            }
        } while (flag);
        System.out.println("Nhập tên lớp  : ");
        String className = scanner.nextLine();
        System.out.println("Nhập điểm học sinh : ");
        double point = Double.parseDouble(scanner.nextLine());
        Student student = new Student(code, name, birthDay, gender, className, point);
        studentRepository.addStudent(student);
        System.out.println("Bạn đã thêm thành công ");
        this.display();
    }

    @Override
    public void deleteStudent() {
        this.display();
        System.out.println("Nhập mã học sinh mà bạn muốn xóa : ");
        String code = scanner.nextLine();
        boolean checkDelete = studentRepository.deleteStudentByCode(code);
        if (checkDelete) {
            System.out.println("Bạn đã xóa thành công ");
        } else {
            System.out.println("Không tìn thấy học sinh bạn cần xóa ");
        }
    }
}

package ss18.bai_tap.service;

import ss18.bai_tap.model.Student;
import ss18.bai_tap.repository.StudentRepository;

import java.util.List;
import java.util.Scanner;

public class StudentService implements IStudentService{
    Scanner scanner = new Scanner(System.in);
    private StudentRepository studentRepository = new StudentRepository();
    @Override
    public void display() {
        List<Student> studentList = studentRepository.getStudentList();
        for (Student p : studentList) {
            System.out.println(p);
        }
    }

    @Override
    public void detele() {
        System.out.println("Nhập mã giảng viên hoặc học sinh mà bạn muốn xóa : ");
        String idStudent = scanner.nextLine();
        boolean check = studentRepository.deteleStudent(idStudent);
        if (check){
            System.out.println("Bạn đã xóa thành công");
        }else {
            System.out.println("Mã bạn nhập không có");
        }
    }
    @Override
    public void more() {
        System.out.println("Nhập ID giảng viên hoặc học sinh : ");
        String idStudent = scanner.nextLine();
        System.out.println("Nhập tên giảng viên hoặc học sinh : ");
        String name = scanner.nextLine();
        System.out.println("Nhập ngày tháng năm sinh giảng viên hoặc học sinh : ");
        String data= scanner.nextLine();
        System.out.println("Nhập Giới tính : ");
        String gender = scanner.nextLine();
        System.out.println("Nhập lớp : ");
        String classs = scanner.nextLine();
        System.out.println("Nhập điểm : ");
        double point = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập giảng viên chuyên môn : ");
        String specialize = scanner.nextLine();
        Student student = new Student(idStudent,name,data,gender,classs,point,specialize);
        studentRepository.addStuden(student);
        System.out.println("Bạn đã thêm thành công");

    }

    @Override
    public void search() {
        System.out.println("Nhập mã ID giảng viên hoặc học sinh mà bạn muốn tìm kiếm : ");
        String search = scanner.nextLine();
        List<Student> studentList1 = studentRepository.searchStudent(search);
        for (Student student : studentList1) {
            System.out.println(student);
        }
    }
}

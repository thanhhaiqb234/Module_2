package ss11.repository;

import ss11.model.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentRepository implements IStudentRepository{
    static List<Student> studentList = new ArrayList<>();
        static {
            studentList.add(new Student("HS_001", "Đinh Thanh Hải","20/09/1999",true,"C03G12023",10.0));
            studentList.add(new Student("HS_002", "Kim Ngọc Thành","30/10/2000",false,"C03G12023",10.0));
            studentList.add(new Student("HS_003", "Trương Tấn Hải","01/05/2000",true,"C03G12023",10.0));
        }

    @Override
    public void addStudent(Student student) {
        studentList.add(student);
    }

    @Override
    public List<Student> getStudent() {
        return studentList;
    }

    @Override
    public boolean deleteStudentByCode(String code) {
        for (int i = 0; i < studentList.size(); i++) {
            if (code.equals(studentList.get(i).getCode())){
                studentList.remove(i);
                return  true;
            }
        }
        return false;
    }
}

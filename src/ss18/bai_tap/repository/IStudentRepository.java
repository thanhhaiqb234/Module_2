package ss18.bai_tap.repository;


import ss18.bai_tap.model.Student;

import java.util.List;

public interface IStudentRepository {
    List<Student> getStudentList();
    boolean deteleStudent(String idStudent);
    void addStuden(Student student);
    List<Student> searchStudent(String idStudent);

}

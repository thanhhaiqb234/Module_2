package ss11.repository;

import ss11.model.Student;

import java.util.List;

public interface IStudentRepository {
    void addStudent(Student student);
    List<Student>getStudent();
    boolean deleteStudentByCode(String code);
}

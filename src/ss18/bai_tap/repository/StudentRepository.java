package ss18.bai_tap.repository;

import ss18.bai_tap.common.ReadAndWrite;
import ss18.bai_tap.model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentRepository implements IStudentRepository{
    private static List<Student> studentList = new ArrayList<>();

    private static final String PATH = "src/ss18/bai_tap/data/student.csv";

    @Override
    public List<Student> getStudentList() {
        List<String> strings = ReadAndWrite.readFile(PATH);
        studentList.clear();
        String[] info;
        for (String str : strings) {
            info = str.split(",");
            studentList.add(new Student(info[0],info[1],info[2],info[3],info[4],Double.parseDouble(info[5]),info[6]));
        }
        return studentList;
    }

    @Override
    public boolean deteleStudent(String idStudent) {
        List<String> strings = new ArrayList<>();
        studentList = getStudentList();
        for (int i = 0; i < studentList.size(); i++) {
            if (idStudent.equals(studentList.get(i).getIdStudent())){
                studentList.remove(i);
            }
        }
        ReadAndWrite.writeFile(PATH, strings, false);
        return true;
    }

    @Override
    public void addStuden(Student student) {
        List<String> strings = new ArrayList<>();
        strings.add(student.getIdStudent()+ "," + student.getName()+ ","+ student.getData()+ ","+ student.getGender()+ ","+ student.getClasss()+
                ","+ student.getPoint()+","+ student.getSpecialize());
        ReadAndWrite.writeFile(PATH,strings,true);
    }

    @Override
    public List<Student> searchStudent(String idSdtudent) {
        studentList = getStudentList();
        List<Student> studentList1 = new ArrayList<>();
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getIdStudent().contains(idSdtudent)){
                studentList1.add(studentList.get(i));
            }
        }
        return studentList1;
    }

}

package ss18.bai_tap.model;

public class Student {
    private String idStudent;
    private String name;
    private String data;
    private String gender;
    private String classs;
    private double point;
    private String specialize;

    public Student() {
    }

    public Student(String idStudent, String name, String data, String gender, String classs, double point, String specialize) {
        this.idStudent = idStudent;
        this.name = name;
        this.data = data;
        this.gender = gender;
        this.classs = classs;
        this.point = point;
        this.specialize = specialize;
    }

    public String getIdStudent() {
        return idStudent;
    }

    public String getName() {
        return name;
    }

    public String getData() {
        return data;
    }

    public String getGender() {
        return gender;
    }

    public String getClasss() {
        return classs;
    }


    public double getPoint() {
        return point;
    }

    public String getSpecialize() {
        return specialize;
    }

    public void setIdStudent(String idStudent) {
        this.idStudent = idStudent;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setClasss(String classs) {
        this.classs = classs;
    }

    public void setPoint(double point) {
        this.point = point;
    }

    public void setSpecialize(String specialize) {
        this.specialize = specialize;
    }

    @Override
    public String toString() {
        return "Danh Sách{" +
                "ID Học sinh : " + idStudent + '\'' +
                ", Tên HS : " + name + '\'' +
                ", Ngày tháng năm sinh : " + data + '\'' +
                ", Giới tính : " + gender + '\'' +
                ", Lớp : " + classs + '\'' +
                ", Điểm : " + point +
                ", Giáo viên chuyên môn : " + specialize + '\'' +
                '}';
    }
}

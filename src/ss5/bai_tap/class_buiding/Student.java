package ss5.bai_tap.class_buiding;

public class Student {
    private String name = "john";
    private String classs = "C02";
    public Student() {

    }

    public Student(String name, String classs) {
        this.name = name;
        this.classs = classs;
    }

    public void setClasss(String classs) {
        this.classs = classs;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", classs='" + classs + '\'' +
                '}';
    }
}

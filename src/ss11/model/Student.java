package ss11.model;

public class Student extends Person {
    String className;
    double point;
    public Student(){

    }

    public Student(String code, String name, String birthDay, boolean gender, String className, double point) {
        super(code, name, birthDay, gender);
        this.className = className;
        this.point = point;
    }

    public Student(String s, String đinhThanhHải, String s1, boolean b, String c0323G1, float v, String tạmỔn) {
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public double getPoint() {
        return point;
    }

    public void setPoint(double point) {
        this.point = point;
    }

    @Override
    public String toString() {
        return "Student : " +
                super.toString()+
                ", Class Name "+className+
                ", Point "+point + "}";
    }

}

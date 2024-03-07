package casestudy2.model;

public class Employee extends Person{
    private String level;
    private String location;
    private String money;

    public Employee() {
    }

    public Employee(String codeEmployee, String nameEmployee, String datatime, String gender,
                    String citizenIdentification, String phoneNumber, String email, String level,
                    String location, String money) {
        super(codeEmployee, nameEmployee, datatime, gender, citizenIdentification, phoneNumber, email);
        this.level = level;
        this.location = location;
        this.money = money;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Thông tin " +
                super.toString()+
                " | Trình độ : " + level + '\'' +
                " | Vị trí : " + location + '\'' +
                " | Lương : " + money + '\'' +
                '}';
    }
}

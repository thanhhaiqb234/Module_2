package casestudy.model;



public class Employee extends Person{
    private String level;
    private String location;
    private String money;
    private Employee(){

    }

    public Employee(String employeeCode, String name, String dataTime, String gender, String citizenIdentification,
                    String phoneNumber, String email, String level, String location, String money) {
        super(employeeCode, name, dataTime, gender, citizenIdentification, phoneNumber, email);
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
        return "Employee{" +
                super.toString()+
                "level :" + level + '\'' +
                ", location :" + location + '\'' +
                ", money :" + money + '\'' +
                '}';
    }
}

package casestudy.model;

public abstract class Person {
    private String employeeCode;
    private String name;
    private String dataTime;
    private String gender;
    private String citizenIdentification;
    private String phoneNumber;
    private String Email;

    public Person() {
    }

    public Person(String employeeCode, String name, String dataTime, String gender, String citizenIdentification,
                  String phoneNumber, String email) {
        this.employeeCode = employeeCode;
        this.name = name;
        this.dataTime = dataTime;
        this.gender = gender;
        this.citizenIdentification = citizenIdentification;
        this.phoneNumber = phoneNumber;
        Email = email;
    }

    public String getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDataTime() {
        return dataTime;
    }

    public void setDataTime(String dataTime) {
        this.dataTime = dataTime;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCitizenIdentification() {
        return citizenIdentification;
    }

    public void setCitizenIdentification(String citizenIdentification) {
        this.citizenIdentification = citizenIdentification;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    @Override
    public String toString() {
        return "person{" +
                "Mã nhân viên :" + employeeCode + '\'' +
                ", Họ và tên :" + name + '\'' +
                ", Ngày sinh :" + dataTime + '\'' +
                ", Giới tính :" + gender + '\'' +
                ", Số CCCD :" + citizenIdentification + '\'' +
                ", Số điện thoại :" + phoneNumber + '\'' +
                ", Email :" + Email + '\'' +
                '}';
    }
}

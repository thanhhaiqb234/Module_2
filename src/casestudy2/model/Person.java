package casestudy2.model;

public abstract class Person {
        private String codeEmployee;
        private String nameEmployee;
        private String datatime;
        private String gender;
        private String citizenIdentification;
        private String phoneNumber;
        private String email;

    public Person() {
    }

    public Person(String codeEmployee, String nameEmployee, String datatime, String gender,
                  String citizenIdentification, String phoneNumber, String email) {
        this.codeEmployee = codeEmployee;
        this.nameEmployee = nameEmployee;
        this.datatime = datatime;
        this.gender = gender;
        this.citizenIdentification = citizenIdentification;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getCodeEmployee() {
        return codeEmployee;
    }

    public void setCodeEmployee(String codeEmployee) {
        this.codeEmployee = codeEmployee;
    }

    public String getNameEmployee() {
        return nameEmployee;
    }

    public void setNameEmployee(String nameEmployee) {
        this.nameEmployee = nameEmployee;
    }

    public String getDatatime() {
        return datatime;
    }

    public void setDatatime(String datatime) {
        this.datatime = datatime;
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
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Nhân viên " +
                " { Mã nhân viên : " + codeEmployee + '\'' +
                " | Họ và tên  : " + nameEmployee + '\'' +
                " | Ngày sinh : " + datatime + '\'' +
                " | Giới tính : " + gender + '\'' +
                " | Số CCCD : " + citizenIdentification + '\'' +
                " | Số điện thoại : " + phoneNumber + '\'' +
                " | Email : " + email + '\'';
    }
}

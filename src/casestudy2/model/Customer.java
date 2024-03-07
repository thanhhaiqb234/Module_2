package casestudy2.model;

public class Customer extends Person{
    private String typeOfGuest;
    private String address;

    public Customer() {
    }

    public Customer(String codeEmployee, String nameEmployee, String datatime, String gender,
                    String citizenIdentification, String phoneNumber, String email, String typeOfGuest, String address) {
        super(codeEmployee, nameEmployee, datatime, gender, citizenIdentification, phoneNumber, email);
        this.typeOfGuest = typeOfGuest;
        this.address = address;
    }

    public String getTypeOfGuest() {
        return typeOfGuest;
    }

    public void setTypeOfGuest(String typeOfGuest) {
        this.typeOfGuest = typeOfGuest;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Danh sách " +
                super.toString()+
                " Loại Khách : " + typeOfGuest + '\'' +
                ", Địa chỉ :  " + address + '\'' +
                '}';
    }
}

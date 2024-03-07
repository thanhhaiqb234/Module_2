package casestudy.model;

public class Customer extends Person{
    private String typeOfGuest;
    private String address;
    public Customer(){

    }

    public Customer(String employeeCode, String name, String dataTime, String gender, String citizenIdentification,
                    String phoneNumber, String email, String typeOfGuest, String address) {
        super(employeeCode, name, dataTime, gender, citizenIdentification, phoneNumber, email);
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
        return "Customer.csv{" +
                super.toString()+
                "Loại khách : " + typeOfGuest + '\'' +
                ", Địa chỉ : " + address + '\'' +
                '}';
    }
}

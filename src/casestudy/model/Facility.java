package casestudy.model;

public abstract class Facility {
    private String serviceCode;
    private String nameService;
    private double acreage;
    private String rentalCosts;
    private int numberOfPeople;
    private String rentalType;

    public Facility() {
    }

    public Facility(String serviceCode, String nameService, double acreage, String rentalCosts, int numberOfPeople, String rentalType) {
        this.serviceCode = serviceCode;
        this.nameService = nameService;
        this.acreage = acreage;
        this.rentalCosts = rentalCosts;
        this.numberOfPeople = numberOfPeople;
        this.rentalType = rentalType;
    }

    public String getServiceCode() {
        return serviceCode;
    }

    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public double getAcreage() {
        return acreage;
    }

    public void setAcreage(double acreage) {
        this.acreage = acreage;
    }

    public String getRentalCosts() {
        return rentalCosts;
    }

    public void setRentalCosts(String rentalCosts) {
        this.rentalCosts = rentalCosts;
    }

    public int getNumberOfPeople() {
        return numberOfPeople;
    }

    public void setNumberOfPeople(int numberOfPeople) {
        this.numberOfPeople = numberOfPeople;
    }

    public String getRentalType() {
        return rentalType;
    }

    public void setRentalType(String rentalType) {
        this.rentalType = rentalType;
    }

    @Override
    public String toString() {
        return "Furama{" +
                "Mã dịch vụ : " + serviceCode + '\'' +
                ", Tên dịch vụ : " + nameService + '\'' +
                ", Diện tích sử dụng : " + acreage +
                ", Chi phí thuê : " + rentalCosts + '\'' +
                ", Số lượng người tối đa : " + numberOfPeople +
                ", Kiểu thuê : " + rentalType + '\'' +
                '}';
    }
}

package casestudy.model;

public class House extends Facility {
    private String roomStandard;
    private int numberOfFloors;
    public House(){

    }

    public House(String serviceCode, String nameService, double acreage, String rentalCosts, int numberOfPeople, String rentalType, String roomStandard, int numberOfFloors) {
        super(serviceCode, nameService, acreage, rentalCosts, numberOfPeople, rentalType);
        this.roomStandard = roomStandard;
        this.numberOfFloors = numberOfFloors;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public String toString() {
        return "House{" +
                "roomStandard='" + roomStandard + '\'' +
                ", numberOfFloors=" + numberOfFloors +
                '}';
    }
}

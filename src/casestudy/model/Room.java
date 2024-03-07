package casestudy.model;

public class Room extends Facility {
    private String freeServiceIncluded;
    public Room(){

    }

    public Room(String serviceCode, String nameService, double acreage, String rentalCosts, int numberOfPeople, String rentalType, String freeServiceIncluded) {
        super(serviceCode, nameService, acreage, rentalCosts, numberOfPeople, rentalType);
        this.freeServiceIncluded = freeServiceIncluded;
    }

    public String getFreeServiceIncluded() {
        return freeServiceIncluded;
    }

    public void setFreeServiceIncluded(String freeServiceIncluded) {
        this.freeServiceIncluded = freeServiceIncluded;
    }

    @Override
    public String toString() {
        return "Room{" +
                "freeServiceIncluded='" + freeServiceIncluded + '\'' +
                '}';
    }
}

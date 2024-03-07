package ss11.model;

public class Tearcher extends Person {
    String lever;

    public Tearcher() {

    }

    public Tearcher(String code, String name, String birthDay, boolean gender, String lever) {
        super(code, name, birthDay, gender);
        this.lever = lever;
    }

    public String getLever() {
        return lever;
    }

    public void setLever(String lever) {
        this.lever = lever;
    }

    @Override
    public String toString() {
        return "Tearcher{" +
                "lever='" + lever + '\'' +
                ", code='" + getCode() + '\'' +
                ", name='" + getName() + '\'' +
                ", birthDay='" + getBirthDay() + '\'' +
                ", gender=" + isGender() +
                '}';
    }

}

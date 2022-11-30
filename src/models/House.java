package models;

public class House extends Facility {
    private String roomStandard;
    private int numberOfFloors;

    public House() {
        super();
    }

    public House(String serviceName, double usableArea, double rentalCosts, int maximumNumberOfPeople, String rentalType, String roomStandard, int numberOfFloors) {
        super(serviceName, usableArea, rentalCosts, maximumNumberOfPeople, rentalType);
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
                "serviceName='" + super.getServiceName() + '\'' +
                ", usableArea=" + super.getUsableArea() +
                ", rentalCost=" + super.getRentalType() +
                ", MaximumNumberOfPeople=" + super.getMaximumNumberOfPeople() +
                ", rentalType='" + super.getRentalType() + '\'' +
                ", roomStandard='" + roomStandard + '\'' +
                ", numberOfFloors=" + numberOfFloors +
                '}';
    }


}

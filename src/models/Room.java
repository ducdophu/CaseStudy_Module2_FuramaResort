package models;

public class Room extends Facility {
    private String freeServiceIncluded;

    public Room() {
        super();
    }

    public Room(String serviceName, double usableArea, double rentalCosts, int maximumNumberOfPeople, String rentalType, String freeServiceIncluded) {
        super(serviceName, usableArea, rentalCosts, maximumNumberOfPeople, rentalType);
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
                "serviceName='" + super.getServiceName() + '\'' +
                ", usableArea=" + super.getUsableArea() +
                ", rentalCost=" + super.getRentalType() +
                ", MaximumNumberOfPeople=" + super.getMaximumNumberOfPeople() +
                ", rentalType='" + super.getRentalType() + '\'' +
                ", freeServiceIncluded='" + freeServiceIncluded + '\'' +
                '}';
    }
}

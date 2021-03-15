package _case_study;

public class Villa extends Services {
    private String standardRoom;
    private String otherFacilities;
    private double poolArea;
    private int numberOfFloors;

    public Villa() {
    }

    public Villa(String id, String nameServices, double areaUsed, double rentalCost, int numberOfPeople, String typeOfRent) {
        super(id, nameServices, areaUsed, rentalCost, numberOfPeople, typeOfRent);
    }

    public String getStandardRoom() {
        return standardRoom;
    }

    public void setStandardRoom(String standardRoom) {
        this.standardRoom = standardRoom;
    }

    public String getOtherFacilities() {
        return otherFacilities;
    }

    public void setOtherFacilities(String otherFacilities) {
        this.otherFacilities = otherFacilities;
    }

    public double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(double poolArea) {
        this.poolArea = poolArea;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public String toString() {
        return "Villa{" +
                "standardRoom='" + standardRoom + '\'' +
                ", otherFacilities='" + otherFacilities + '\'' +
                ", poolArea=" + poolArea +
                ", numberOfFloors=" + numberOfFloors +
                "} " + super.toString();
    }
}

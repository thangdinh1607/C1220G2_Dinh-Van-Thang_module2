package Models;

public class House extends Services {
    private String standardRoom;
    private String otherFacilities;
    private int numberOfFloors;

    public House(String standardRoom, String otherFacilities, int numberOfFloors) {
        this.standardRoom = standardRoom;
        this.otherFacilities = otherFacilities;
        this.numberOfFloors = numberOfFloors;
    }

    public House(String id, String nameServices, double areaUsed, double rentalCost, int numberOfPeople, String typeOfRents,
                 String standardRoom, String otherFacilities, int numberOfFloors) {
        super(id, nameServices, areaUsed, rentalCost, numberOfPeople, typeOfRents);
        this.standardRoom = standardRoom;
        this.otherFacilities = otherFacilities;
        this.numberOfFloors = numberOfFloors;
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

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public String showInFor() {
        return super.toString() +","
                + standardRoom + ","
                + otherFacilities + ","
                + numberOfFloors;

    }

    @Override
    public String toString() {
        return   standardRoom + ","
                 + otherFacilities + ","
                + numberOfFloors ;
    }
}

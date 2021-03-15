package Models;

public class Villa extends Services {
    private String standardRoom;
    private String otherFacilities;
    private double poolArea;
    private int numberOfFloors;


    public Villa(String id, String nameServices, double areaUsed, double rentalCost, int numberOfPeople,
                 String typeOfRents, String standardRoom, String otherFacilities, double poolArea, int numberOfFloors) {
        super(id, nameServices, areaUsed, rentalCost, numberOfPeople, typeOfRents);
        this.standardRoom = standardRoom;
        this.otherFacilities = otherFacilities;
        this.poolArea = poolArea;
        this.numberOfFloors = numberOfFloors;
    }

    public Villa() {

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
        return  super.toString()
                + ","+standardRoom
                + "," + otherFacilities
                + "," + poolArea
                + "," + numberOfFloors;
    }

    @Override
    public String showInFor() {
        return  super.toString()
                +","+standardRoom
                + "," +otherFacilities
                + "," + poolArea
                + ","+ numberOfFloors ;


    }
}

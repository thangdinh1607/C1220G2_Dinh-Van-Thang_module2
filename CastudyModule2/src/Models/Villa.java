package Models;

public class Villa extends Services {
    private String standardRoom;
    private String otherFacilities;
    private double areaPool;
    private int numberOfFloor;


    public Villa(String standardRoom, String otherFacilities, double areaPool, int numberOfFloor) {
        this.standardRoom = standardRoom;
        this.otherFacilities = otherFacilities;
        this.areaPool = areaPool;
        this.numberOfFloor = numberOfFloor;
    }

    public Villa(String nameServices, double areaUsed, double rentalCost, int numberOfPeople, String typeOfRent) {
        super(nameServices, areaUsed, rentalCost, numberOfPeople, typeOfRent);
    }

    public Villa(String nameServices, double areaUsed, double rentalCost, int numberOfPeople, String typeOfRent, String standardRoom, String otherFacilities, double areaPool, int numberOfFloor) {
        super(nameServices, areaUsed, rentalCost, numberOfPeople, typeOfRent);
        this.standardRoom = standardRoom;
        this.otherFacilities = otherFacilities;
        this.areaPool = areaPool;
        this.numberOfFloor = numberOfFloor;
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

    public double getAreaPool() {
        return areaPool;
    }

    public void setAreaPool(double areaPool) {
        this.areaPool = areaPool;
    }

    public int getNumberOfFloor() {
        return numberOfFloor;
    }

    public void setNumberOfFloor(int numberOfFloor) {
        this.numberOfFloor = numberOfFloor;
    }

    @Override
    String showInFor() {
        return "Services{" +
                "nameServices='" + super.getNameServices() + '\'' +
                ", areaUsed=" + super.getAreaUsed() +
                ", rentalCost=" + super.getRentalCost() +
                ", numberOfPeople=" + super.getNumberOfPeople() +
                ", typeOfRent='" + super.getTypeOfRent() + "," +
                "standardRoom='" + standardRoom + '\'' +
                ", otherFacilities='" + otherFacilities + '\'' +
                ", areaPool=" + areaPool +
                ", numberOfFloor=" + numberOfFloor;
    }

    @Override
    public String toString() {
        return super.toString() + ","
                + standardRoom + ","
                + otherFacilities + ","
                + areaPool + ","
                + numberOfFloor;
    }
}

package Models;

public class House extends Services {
    private String standardRoom;
    private String otherFacilities;
    private int numberOfFloor;

    public House(String standardRoom, String otherFacilities, int numberOfFloor) {
        this.standardRoom = standardRoom;
        this.otherFacilities = otherFacilities;
        this.numberOfFloor = numberOfFloor;
    }

    public House(String nameServices, double areaUsed, double rentalCost, int numberOfPeople, String typeOfRent, String standardRoom, String otherFacilities, int numberOfFloor) {
        super(nameServices, areaUsed, rentalCost, numberOfPeople, typeOfRent);
        this.standardRoom = standardRoom;
        this.otherFacilities = otherFacilities;
        this.numberOfFloor = numberOfFloor;
    }


    public House() {

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

    public int getNumberOfFloor() {
        return numberOfFloor;
    }

    public void setNumberOfFloor(int numberOfFloor) {
        this.numberOfFloor = numberOfFloor;
    }

    @Override
    public String showInFor() {
        return "House{" +
                "nameServices='" + super.getNameServices() + '\'' +
                ", areaUsed=" + super.getAreaUsed() +
                ", rentalCost=" + super.getRentalCost() +
                ", numberOfPeople=" + super.getNumberOfPeople() +
                ", typeOfRent='" + super.getTypeOfRent() + "," +
                "standardRoom='" + standardRoom + '\'' +
                ", otherFacilities='" + otherFacilities + '\'' +
                ", numberOfFloor=" + numberOfFloor;
    }

    @Override
    public String toString() {
        return super.toString() + ","
                + standardRoom + ","
                + otherFacilities + ","
                + numberOfFloor;
    }


}

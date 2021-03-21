package Models;

public class Room extends Services {
    private String freeServices;

    public Room(String freeServices) {
        this.freeServices = freeServices;
    }

    public Room(String nameServices, double areaUsed, double rentalCost, int numberOfPeople, String typeOfRent, String freeServices) {
        super(nameServices, areaUsed, rentalCost, numberOfPeople, typeOfRent);
        this.freeServices = freeServices;
    }

    public Room() {

    }

    public String getFreeServices() {
        return freeServices;
    }

    public void setFreeServices(String freeServices) {
        this.freeServices = freeServices;
    }

    @Override
    public String toString() {
        return super.toString() + ","
                + freeServices;
    }

    @Override
    public String showInFor() {
        return "Room{" +
                "nameServices='" + super.getNameServices() + '\'' +
                ", areaUsed=" + super.getAreaUsed() +
                ", rentalCost=" + super.getRentalCost() +
                ", numberOfPeople=" + super.getNumberOfPeople() +
                ", typeOfRent='" + super.getTypeOfRent() + "," +
                "freeServices = " + freeServices;
    }
}

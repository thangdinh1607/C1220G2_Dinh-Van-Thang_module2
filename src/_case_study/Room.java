package _case_study;

public class Room extends Services {
    private String freeServices;

    public Room() {
    }


    public Room(String freeServices) {
        this.freeServices = freeServices;
    }

    public Room(String id, String nameServices, double areaUsed, double rentalCost, int numberOfPeople, String typeOfRent, String freeServices) {
        super(id, nameServices, areaUsed, rentalCost, numberOfPeople, typeOfRent);
        this.freeServices = freeServices;
    }

    public String getFreeServices() {
        return freeServices;
    }

    public void setFreeServices(String freeServices) {
        this.freeServices = freeServices;
    }

    @Override
    public String toString() {
        return "Room{" +
                "freeServices='" + freeServices + '\'' +
                "} " + super.toString();
    }
}

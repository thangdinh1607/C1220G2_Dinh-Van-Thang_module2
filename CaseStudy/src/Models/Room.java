package Models;

public class Room extends Services {
    private String freeServices;

    public Room(String freeServices) {
        this.freeServices = freeServices;
    }

    public Room(String id, String nameServices, double areaUsed, double rentalCost, int numberOfPeople, String typeOfRents, String freeServices) {
        super(id, nameServices, areaUsed, rentalCost, numberOfPeople, typeOfRents);
        this.freeServices = freeServices;
    }

    public String getFreeServices() {
        return freeServices;
    }

    public void setFreeServices(String freeServices) {
        this.freeServices = freeServices;
    }

    @Override
    public String showInFor() {
        return super.toString()+","
                 + freeServices;

    }
}

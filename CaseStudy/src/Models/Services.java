package Models;

public abstract class Services {
    private String id;
    private String nameServices;
    private double areaUsed;
    private double rentalCost;
    private int numberOfPeople;
    private String typeOfRents;

    public Services() {
    }

    public Services(String id, String nameServices, double areaUsed, double rentalCost, int numberOfPeople, String typeOfRents) {
        this.id = id;
        this.nameServices = nameServices;
        this.areaUsed = areaUsed;
        this.rentalCost = rentalCost;
        this.numberOfPeople = numberOfPeople;
        this.typeOfRents = typeOfRents;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNameServices() {
        return nameServices;
    }

    public void setNameServices(String nameServices) {
        this.nameServices = nameServices;
    }

    public double getAreaUsed() {
        return areaUsed;
    }

    public void setAreaUsed(double areaUsed) {
        this.areaUsed = areaUsed;
    }

    public double getRentalCost() {
        return rentalCost;
    }

    public void setRentalCost(double rentalCost) {
        this.rentalCost = rentalCost;
    }

    public int getNumberOfPeople() {
        return numberOfPeople;
    }

    public void setNumberOfPeople(int numberOfPeople) {
        this.numberOfPeople = numberOfPeople;
    }

    public String getTypeOfRents() {
        return typeOfRents;
    }

    public void setTypeOfRents(String typeOfRents) {
        this.typeOfRents = typeOfRents;
    }
    public abstract String showInFor();

    @Override
    public String toString() {
        return  id
                + "," + nameServices
                + "," + areaUsed
                + "," +rentalCost
                + "," + numberOfPeople
                + ","+ typeOfRents;
    }
}

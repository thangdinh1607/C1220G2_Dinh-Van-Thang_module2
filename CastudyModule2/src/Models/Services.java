package Models;

public abstract class Services {
    private String nameServices;
    private double areaUsed;
    private double rentalCost;
    private int numberOfPeople;
    private String typeOfRent;

    public Services(String nameServices, double areaUsed, double rentalCost, int numberOfPeople, String typeOfRent) {
        this.nameServices = nameServices;
        this.areaUsed = areaUsed;
        this.rentalCost = rentalCost;
        this.numberOfPeople = numberOfPeople;
        this.typeOfRent = typeOfRent;
    }

    public Services() {
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

    public String getTypeOfRent() {
        return typeOfRent;
    }

    public void setTypeOfRent(String typeOfRent) {
        this.typeOfRent = typeOfRent;
    }

    @Override
    public String toString() {
        return nameServices + ","
                + areaUsed +","
                +rentalCost+","
                + numberOfPeople +","
                +typeOfRent;
    }

    abstract String showInFor();
}

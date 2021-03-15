package _case_study;

public class House extends Services {
    private String standard;
    private String otherFacilities;
    private int numberOfFloors;

    public House() {
    }

    public House(String id, String nameServices, double areaUsed, double rentalCost, int numberOfPeople, String typeOfRent) {
        super(id, nameServices, areaUsed, rentalCost, numberOfPeople, typeOfRent);
    }

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard;
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
    public String toString() {
        return "House{" +
                "standard='" + standard + '\'' +
                ", otherFacilities='" + otherFacilities + '\'' +
                ", numberOfFloors=" + numberOfFloors +
                "} " + super.toString();
    }
}

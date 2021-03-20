package Models;

public class AccompaniedService {
    private String nameServices;
    private int unit;
    private double price;

    public AccompaniedService() {
    }

    public AccompaniedService(String nameServices, int unit, double price) {
        this.nameServices = nameServices;
        this.unit = unit;
        this.price = price;
    }

    public String getNameServices() {
        return nameServices;
    }

    public void setNameServices(String nameServices) {
        this.nameServices = nameServices;
    }

    public int getUnit() {
        return unit;
    }

    public void setUnit(int unit) {
        this.unit = unit;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return nameServices + ","
                + unit + ","
                + price;
    }
}

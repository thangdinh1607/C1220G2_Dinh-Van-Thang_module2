package _17_binaryfile_Serialization.BT;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

public class Product implements Serializable {
    private int id;
    private String name;
    private String manufacture;
    private int price;

    public Product(int id, String name, String manufacture, int price) {
        this.id = id;
        this.name = name;
        this.manufacture = manufacture;
        this.price = price;
    }

    public Product() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", manufacture='" + manufacture + '\'' +
                ", price=" + price +
                '}';
    }

}

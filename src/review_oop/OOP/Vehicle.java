package review_oop.OOP;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Vehicle {
    private String name;
    private int since;
    private String color = "";
    private int capacity;
    private int price;

    public Vehicle() {
    }

    public Vehicle(String name, int since, String color, int capacity, int price) {
        this.name = name;
        this.since = since;
        this.color = color;
        this.capacity = capacity;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSince() {
        return since;
    }

    public void setSince(int since) {
        this.since = since;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }



    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                ", since=" + since +
                ", color='" + color + '\'' +
                ", capacity=" + capacity +
                ", price=" + price +
                '}';
    }
}

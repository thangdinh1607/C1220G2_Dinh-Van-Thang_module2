package review_oop.OOP;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Vehicle {
    private String name;
    private int since;
    private String color = "";
    private double capacity;
    private double price;

    public Vehicle() {
    }

    public Vehicle(String name, int since, String color, double capacity, double price) {
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

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    String getTax() {
        if (this.capacity < 100) {
            return "motorbike name" + this.name + "Tax: " + this.price / 100;
        } else if (this.capacity < 200) {
            return "motorbike name" + this.name + "Tax: " + this.price * 3 / 100;
        } else
            return "motorbike name" + this.name + "Tax: " + this.price * 5 / 100;
    }

     Vehicle motorInformation() {
        Vehicle motorbike = new Vehicle();
        Scanner input = new Scanner(System.in);

        System.out.println("Input motorbike name ");
        String name = input.nextLine();
        motorbike.setName(name);

        System.out.println("Input motorbike since ");
        int since = input.nextInt();
        motorbike.setSince(since);

        System.out.println("Input motorbike color ");
        String color = input.nextLine();
        motorbike.setColor(color);

        System.out.println("Input motorbike capacity ");
        double capacity = input.nextDouble();
        motorbike.setCapacity(capacity);

        System.out.println("Input motorbike price ");
        double price = input.nextDouble();
        motorbike.setPrice(price);

        return motorbike;
    }



    public static void main(String[] args) {
        List<Vehicle> motorbike= new ArrayList<>();
       Scanner input = new Scanner(System.in);
        System.out.println("1.Tạo các đối tượng xe và nhập thông tin" + "\n" +
                "2.Xuất bảng kê khai tiền thuế của các xe." + "\n" +
                "3.Thoát");
        int a =input.nextInt();
        switch (a){
            case 1:
        }
    }
}

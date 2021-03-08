package review_oop.OOP;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Vehicle {
    private String name;
    private int since;
    private String color;
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

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    int getTax() {
        if (this.capacity < 100) {
            return this.price / 100;
        } else if (this.capacity < 200) {
            return this.price * 3 / 100;
        } else
            return this.price * 5 / 100;
    }

    public static void main(String[] args) {

        ArrayList<Vehicle> motorBikes = new ArrayList<>();
        Vehicle motor1 = new Vehicle();
        Scanner scanner = new Scanner(System.in);

        System.out.println("1.Input information of motorbike " +"\n"
                + "2.Output table of tax"+"\n"
                + "3.Exit");
        int menu = scanner.nextInt();
        if (menu == 1) {

            System.out.println("Input name :");
            String name = scanner.nextLine();
            motor1.setName(name);

            System.out.println("Input since :");
            int since = scanner.nextInt();
            motor1.setSince(since);

            System.out.println("Input color :");
            String color = scanner.nextLine();
            motor1.setColor(color);

            System.out.println("Input capacity");
            int capacity = scanner.nextInt();
            motor1.setCapacity(capacity);

            System.out.println("Input price");
            int price = scanner.nextInt();
            motor1.setPrice(price);

            motorBikes.add(motor1);
        } else if (menu == 2) {
            for (int i = 0; i < motorBikes.size(); i++) {
                System.out.println(motorBikes.get(i).getTax());
            }
        }else
            return;
    }
}

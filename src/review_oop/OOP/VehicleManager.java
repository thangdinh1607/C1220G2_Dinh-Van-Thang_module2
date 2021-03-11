package review_oop.OOP;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VehicleManager {
    public static final String LINK = "F:\\C1220G2_Dinh-Van-Thang_module2\\src\\review_oop\\OOP";

    void addMotorbike() {
        List<Vehicle> listMotor = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        System.out.println("Enter name :");
        String name = input.nextLine();
        System.out.println("Enter since :");
        int since = Integer.parseInt(input.nextLine());
        System.out.println("Enter color :");
        String color = input.nextLine();
        System.out.println("Enter capacity");
        int capacity = Integer.parseInt(input.nextLine());
        System.out.println("Enter price :");
        int price = Integer.parseInt(input.nextLine());

        Vehicle vehicle = new Vehicle(name, since, color, capacity, price);
        listMotor.add(vehicle);
    }

    List<Vehicle> objectInput() {
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        List<Vehicle> listMotor = null;
        try {
            fis = new FileInputStream(LINK);
            ois = new ObjectInputStream(fis);
            listMotor = (ArrayList<Vehicle>) ois.readObject();

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {

            try {
                ois.close();
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return listMotor;
    }

    void objectOutput(List<Vehicle> motorbike) {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream(LINK);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(motorbike);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fos.close();
                oos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    void mainMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1.Tạo các đối tượng xe và nhập thông tin\n" +
                "2.Xuất bảng kê khai tiền thuế của các xe.\n" +
                "3.Thoát");
        int menu = Integer.parseInt(scanner.nextLine());
        switch (menu) {
            case 1:
                addMotorbike();
                mainMenu();
            case 2:
        }
    }
}

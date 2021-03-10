package _17_binaryfile_Serialization.BT;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductManager {
    public static final String LINK = "src\\_17_binaryfile_Serialization\\BT\\product";

    void addProduct() {
        List<Product> arrayList = new ArrayList<>(objectInputProduct());
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter id ");
        int id =Integer.parseInt(scanner.nextLine());

        System.out.println("Enter name :");
        String name = scanner.nextLine();

        System.out.println("Enter manufacture");
        String manufacture = scanner.nextLine();

        System.out.println("Enter price");
        int price =Integer.parseInt(scanner.nextLine());

        Product product = new Product(id, name, manufacture, price);
        arrayList.add(product);
        objectOutPut(arrayList);
    }

    void searchProduct() {
        List<Product> arrayList = new ArrayList<>(objectInputProduct());
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name :");
        String name = scanner.nextLine();
        for (Product product : arrayList) {
            if (name.equals(product.getName())) {
                System.out.println(product);
            }
        }

    }

    void showProduct() {
        List<Product> arrayList = new ArrayList<>(objectInputProduct());
        for (Product product : arrayList) {
            System.out.println(product);
        }
    }

    List<Product> objectInputProduct() {
        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;
        List<Product> arrayList = null;
        try {
            fileInputStream = new FileInputStream(LINK);
            objectInputStream = new ObjectInputStream(fileInputStream);

            arrayList = (ArrayList<Product>) objectInputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.getStackTrace();
        } finally {
            try {
                fileInputStream.close();
                objectInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return arrayList;
    }

    void objectOutPut(List<Product> products) {
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(LINK);
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(products);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fileOutputStream.close();
                objectOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    void mainMenu() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Main Menu :" + "\n" +
                            "1.Add Product" + "\n" +
                            "2.Show Product" + "\n" +
                            "3.Search Product" + "\n" +
                            "4.Exit");
        int menu = Integer.parseInt(scanner.nextLine());
        switch (menu) {
            case 1:
                addProduct();
                mainMenu();
                break;
            case 2:
                showProduct();
                break;
            case 3:
                searchProduct();
                mainMenu();
                break;
            default:
                System.out.println("Exit");
        }
    }
}


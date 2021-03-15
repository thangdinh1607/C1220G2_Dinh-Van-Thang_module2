package Controllers;

import Models.House;
import Models.Room;
import Models.Services;
import Models.Villa;
import jdk.internal.org.objectweb.asm.tree.MultiANewArrayInsnNode;

import java.io.FileOutputStream;
import java.util.Scanner;

public class AddNewServices {
    public static final String LINK_VILLA = "F:\\C1220G2_Dinh-Van-Thang_module2\\CaseStudy\\src\\Data\\Villa.csv";
    public static final String LINK_HOUSE = "F:\\C1220G2_Dinh-Van-Thang_module2\\CaseStudy\\src\\Data\\House.csv";
    public static final String LINK_ROOM = "F:\\C1220G2_Dinh-Van-Thang_module2\\CaseStudy\\src\\Data\\Room.csv";



    void addNewVilla() {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter id :");
        String id = input.nextLine();

        System.out.println("Enter name service :");
        String nameServices = input.nextLine();

        System.out.println("Enter area used :");
        double areaUsed = Double.parseDouble(input.nextLine());

        System.out.println("Enter rental cost :");
        double rentalCost = Double.parseDouble(input.nextLine());

        System.out.println("Enter number of people");
        int numberOfPeople = Integer.parseInt(input.nextLine());

        System.out.println("Enter type of rent :");
        String typeOfRents = input.nextLine();

        System.out.println("Enter standard room :");
        String standardRoom = input.nextLine();

        System.out.println("Enter other facilities :");
        String otherFacilities = input.nextLine();

        System.out.println("Enter pool area :");
        double poolArea = Double.parseDouble(input.nextLine());

        System.out.println("Enter floor :");
        int numberOfFloors = Integer.parseInt(input.nextLine());


        Services villa = new Villa(id, nameServices, areaUsed, rentalCost, numberOfPeople,
                typeOfRents, standardRoom, otherFacilities, poolArea, numberOfFloors);

        WriterFile wf = new WriterFile();
        wf.writerFile(LINK_VILLA, villa);
    }

    void addNewHouse() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter id :");
        String id =(input.nextLine());

        System.out.println("Enter name service :");
        String nameServices = input.nextLine();

        System.out.println("Enter area used :");
        double areaUsed = Double.parseDouble(input.nextLine());

        System.out.println("Enter rental cost :");
        double rentalCost = Double.parseDouble(input.nextLine());

        System.out.println("Enter number of people");
        int numberOfPeople = Integer.parseInt(input.nextLine());

        System.out.println("Enter type of rent :");
        String typeOfRents = input.nextLine();

        System.out.println("Enter standard room :");
        String standardRoom = input.nextLine();

        System.out.println("Enter other facilities :");
        String otherFacilities = input.nextLine();

        System.out.println("Enter floor :");
        int numberOfFloors = Integer.parseInt(input.nextLine());

        Services house = new House(id, nameServices, areaUsed, rentalCost, numberOfPeople, typeOfRents,
                standardRoom, otherFacilities, numberOfFloors);
        WriterFile wf = new WriterFile();
        wf.writerFile(LINK_HOUSE, house);
    }

    void addNewRoom() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter id :");
        String id =(input.nextLine());

        System.out.println("Enter name service :");
        String nameServices = input.nextLine();

        System.out.println("Enter area used :");
        double areaUsed = Double.parseDouble(input.nextLine());

        System.out.println("Enter rental cost :");
        double rentalCost = Double.parseDouble(input.nextLine());

        System.out.println("Enter number of people");
        int numberOfPeople = Integer.parseInt(input.nextLine());

        System.out.println("Enter type of rent :");
        String typeOfRents = input.nextLine();

        System.out.println("Enter free Services :");
        String freeServices = input.nextLine();

        Services room = new Room(id, nameServices, areaUsed, rentalCost, numberOfPeople, typeOfRents, freeServices);
        WriterFile wf = new WriterFile();
        wf.writerFile(LINK_ROOM, room);
    }

    void addNewServicesMenu() {
        MainController mainMenu = new MainController();
        Scanner input = new Scanner(System.in);
        System.out.println("1.Add New Villa\n" +
                "2.Add New House\n" +
                "3.Add New Room\n" +
                "4.Back to menu\n" +
                "5.Exit");
        int menu = Integer.parseInt(input.nextLine());
        switch (menu) {
            case 1:
                addNewVilla();
                mainMenu.displayMainMenu();
                break;
            case 2:
                addNewHouse();
                mainMenu.displayMainMenu();
                break;
            case 3:
                addNewRoom();
                mainMenu.displayMainMenu();
                break;
            case 4:
                mainMenu.displayMainMenu();
                break;
            case 5:
                System.out.println("Exit");
                break;
            default:
                System.out.println("Input false ");
        }
    }
}

package Controllers;

import Commons.RegularExpression;
import Commons.WriteFile;
import Models.House;
import Models.Room;
import Models.Services;
import Models.Villa;

import java.sql.SQLOutput;
import java.util.Scanner;

public class AddNewServices {
    Scanner scanner = new Scanner(System.in);
    public static final String LINK_VILLA = "F:\\C1220G2_Dinh-Van-Thang_module2\\CastudyModule2\\src\\Data\\Villa\\Villa.csv";
    public static final String LINK_HOUSE = "F:\\C1220G2_Dinh-Van-Thang_module2\\CastudyModule2\\src\\Data\\Villa\\House.csv";
    public static final String LINK_ROOM = "F:\\C1220G2_Dinh-Van-Thang_module2\\CastudyModule2\\src\\Data\\Villa\\Room.csv";
    public static final String LINK_CUSTOMER = "F:\\C1220G2_Dinh-Van-Thang_module2\\CastudyModule2\\src\\Data\\Villa\\Customer.csv";
    public static final String LINK_BOOKING = "F:\\C1220G2_Dinh-Van-Thang_module2\\CastudyModule2\\src\\Data\\Villa\\Booking.csv";
    RegularExpression re = new RegularExpression();

    void addNewServices() {
        System.out.println("1.Add New Villa\n" +
                "2.Add New House\n" +
                "3.Add New Room\n" +
                "4.Back to menu\n" +
                "5.Exit");
    }

    void addNewVilla() {
        String nameServices = re.checkNameServices();
        double areaUsed = re.checkAreaUsed();
        double rentalCost = re.checkRentalCost();
        int numberOfPeople = re.checkNumberOfPeople();
        String typeOfRent = re.checkTypeOfRent();
        String standardRoom = re.checkStandardRoom();
        String otherFacilities = re.checkOtherFacilities();
        double areaPool = re.checkAreaPool();
        int numberOfFloor = re.checkNumberOfFloor();

        Services villa = new Villa(nameServices, areaUsed, rentalCost, numberOfPeople, typeOfRent, standardRoom, otherFacilities, areaPool, numberOfFloor);
        WriteFile wf = new WriteFile();
        wf.writeFile(LINK_VILLA, villa);

    }

    void addNewHouse() {
        String nameServices = re.checkNameServices();
        double areaUsed = re.checkAreaUsed();
        double rentalCost = re.checkRentalCost();
        int numberOfPeople = re.checkNumberOfPeople();
        String typeOfRent = re.checkTypeOfRent();
        String standardRoom = re.checkStandardRoom();
        String otherFacilities = re.checkOtherFacilities();
        int numberOfFloor = re.checkNumberOfPeople();

        Services house = new House(nameServices, areaUsed, rentalCost, numberOfPeople, typeOfRent, standardRoom, otherFacilities, numberOfFloor);
        WriteFile wf = new WriteFile();
        wf.writeFile(LINK_HOUSE, house);
    }

    void addNewRoom() {
        String nameServices = re.checkNameServices();
        double areaUsed = re.checkAreaUsed();
        double rentalCost = re.checkRentalCost();
        int numberOfPeople = re.checkNumberOfPeople();
        String typeOfRent = re.checkTypeOfRent();
        String freeServices = re.checkFreeServices();

        Services room = new Room(nameServices, areaUsed, rentalCost, numberOfPeople, typeOfRent, freeServices);
        WriteFile wf = new WriteFile();
        wf.writeFile(LINK_ROOM, room);
    }
}

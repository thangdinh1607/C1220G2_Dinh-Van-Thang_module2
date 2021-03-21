package Controllers;

import Commons.ReaderFile;
import Commons.WriteFile;
import Models.*;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.io.FileReader;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class AddNewBooking {
    Scanner scanner = new Scanner(System.in);
    ReaderFile rf = new ReaderFile();
    WriteFile wf = new WriteFile();
    ShowInFormationCustomer showInFormationCustomer = new ShowInFormationCustomer();


    void addNewBooking(Services service) {

        showInFormationCustomer.showInformationCustomer();
        System.out.println("Enter number customer :");
        int menu = Integer.parseInt(scanner.nextLine()) - 1;

        List<String[]> customerList = new ArrayList<>(rf.readerFile(AddNewServices.LINK_CUSTOMER));
        String[] arrCustomer = customerList.get(menu);

        Customer customer = new Customer();
        customer.setNameCustomer(arrCustomer[0]);
        customer.setBirthDayCustomer(arrCustomer[1]);
        customer.setGenderCustomer(arrCustomer[2]);
        customer.setIdCard(Integer.parseInt(arrCustomer[3]));
        customer.setPhoneNumber(Integer.parseInt(arrCustomer[4]));
        customer.setEmailCustomer(arrCustomer[5]);
        customer.setTypeOfCustomer(arrCustomer[6]);
        customer.setAddress(arrCustomer[7]);
        customer.setServices(service);

        wf.writeFile(AddNewServices.LINK_BOOKING,customer);
    }

    Villa bookingVilla() {
        ShowServices showServices = new ShowServices();
        showServices.showVilla();
        System.out.println("Enter Number Villa : ");
        int menu = Integer.parseInt(scanner.nextLine()) - 1;

        List<String[]> villaList = rf.readerFile(AddNewServices.LINK_VILLA);
        String[] stringVilla = villaList.get(menu);

        Villa villa = new Villa();
        villa.setNameServices(stringVilla[0]);
        villa.setAreaUsed(Double.parseDouble(stringVilla[1]));
        villa.setRentalCost(Double.parseDouble(stringVilla[2]));
        villa.setNumberOfPeople(Integer.parseInt(stringVilla[3]));
        villa.setTypeOfRent(stringVilla[4]);
        villa.setStandardRoom(stringVilla[5]);
        villa.setOtherFacilities(stringVilla[6]);
        villa.setAreaPool(Double.parseDouble(stringVilla[7]));
        villa.setNumberOfFloor(Integer.parseInt(stringVilla[8]));

        return villa;
    }

    House bookingHouse() {
        ShowServices showServices = new ShowServices();
        showServices.showHouse();
        System.out.println("Enter Number House : ");
        int menu = Integer.parseInt(scanner.nextLine()) -1;

        List<String[]> houseList = rf.readerFile(AddNewServices.LINK_HOUSE);
        String[] houseString = houseList.get(menu);

        House house = new House();

        house.setNameServices(houseString[0]);
        house.setAreaUsed(Double.parseDouble(houseString[1]));
        house.setRentalCost(Double.parseDouble(houseString[2]));
        house.setNumberOfPeople(Integer.parseInt(houseString[3]));
        house.setTypeOfRent(houseString[4]);
        house.setStandardRoom(houseString[5]);
        house.setOtherFacilities(houseString[6]);
        house.setNumberOfFloor(Integer.parseInt(houseString[7]));

        return house;
    }

    Room bookingRoom() {
        ShowServices showServices = new ShowServices();
        showServices.showRoom();
        System.out.println("Enter Number room : ");
        int menu = Integer.parseInt(scanner.nextLine()) -1 ;

        List<String[]> roomList = rf.readerFile(AddNewServices.LINK_ROOM);
        String[] roomString = roomList.get(menu);

        Room room = new Room();
        room.setNameServices(roomString[0]);
        room.setAreaUsed(Double.parseDouble(roomString[1]));
        room.setRentalCost(Double.parseDouble(roomString[2]));
        room.setNumberOfPeople(Integer.parseInt(roomString[3]));
        room.setTypeOfRent(roomString[4]);
        room.setFreeServices(roomString[5]);

        return room;
    }
}




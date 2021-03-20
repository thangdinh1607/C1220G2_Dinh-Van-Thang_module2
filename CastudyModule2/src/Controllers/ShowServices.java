package Controllers;

import Commons.ReaderFile;
import Models.House;
import Models.Room;
import Models.Services;
import Models.Villa;

import java.util.List;

public class ShowServices {

    void showVilla() {
        ReaderFile rf = new ReaderFile();
        List<String[]> readerList = rf.readerFile(AddNewServices.LINK_VILLA);
        Villa villa = new Villa();
        int i = 1;
        for (String[] service : readerList) {

            villa.setNameServices(service[0]);
            villa.setAreaUsed(Double.parseDouble(service[1]));
            villa.setRentalCost(Double.parseDouble(service[2]));
            villa.setNumberOfPeople(Integer.parseInt(service[3]));
            villa.setTypeOfRent(service[4]);
            villa.setStandardRoom(service[5]);
            villa.setOtherFacilities(service[6]);
            villa.setAreaPool(Double.parseDouble(service[7]));
            villa.setNumberOfFloor(Integer.parseInt(service[8]));

            System.out.println(i + "--- " + villa);
            i++;
        }
    }

    void showHouse() {
        ReaderFile rf = new ReaderFile();
        List<String[]> readerList = rf.readerFile(AddNewServices.LINK_HOUSE);
        House house = new House();
        int i = 1;
        for (String[] service : readerList) {
            house.setNameServices(service[0]);
            house.setAreaUsed(Double.parseDouble(service[1]));
            house.setRentalCost(Double.parseDouble(service[2]));
            house.setNumberOfPeople(Integer.parseInt(service[3]));
            house.setTypeOfRent(service[4]);
            house.setStandardRoom(service[5]);
            house.setOtherFacilities(service[6]);
            house.setNumberOfFloor(Integer.parseInt(service[7]));

            System.out.println(i + "--- " + house);
            i++;
        }
    }


    void showRoom() {
        int i = 1;
        ReaderFile rf = new ReaderFile();
        List<String[]> readerList = rf.readerFile(AddNewServices.LINK_ROOM);
        Room room = new Room();
        for (String[] service : readerList) {
            room.setNameServices(service[0]);
            room.setAreaUsed(Double.parseDouble(service[1]));
            room.setRentalCost(Double.parseDouble(service[2]));
            room.setNumberOfPeople(Integer.parseInt(service[3]));
            room.setTypeOfRent(service[4]);
            room.setFreeServices(service[5]);

            System.out.println(i + "--- " + room);
            i++;
        }
    }
}

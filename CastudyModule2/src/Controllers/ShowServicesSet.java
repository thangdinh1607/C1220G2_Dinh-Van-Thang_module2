package Controllers;

import Commons.ReaderFile;
import Commons.ServicesSortName;
import Models.House;
import Models.Room;
import Models.Services;
import Models.Villa;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ShowServicesSet {
    ReaderFile rf = new ReaderFile();

    void showServiceVilla() {
        List<String[]> villaList = rf.readerFile(AddNewServices.LINK_VILLA);
        Set<Villa> services = new TreeSet<>(Comparator.comparing(Services::getNameServices));
        int i = 1;
        for (String[] service : villaList) {
            Villa villa = new Villa();

            villa.setNameServices(service[0]);
            villa.setAreaUsed(Double.parseDouble(service[1]));
            villa.setRentalCost(Double.parseDouble(service[2]));
            villa.setNumberOfPeople(Integer.parseInt(service[3]));
            villa.setTypeOfRent(service[4]);
            villa.setStandardRoom(service[5]);
            villa.setOtherFacilities(service[6]);
            villa.setAreaPool(Double.parseDouble(service[7]));
            villa.setNumberOfFloor(Integer.parseInt(service[8]));

            services.add(villa);
        }

        for (Villa e : services) {
            System.out.println(i + "--" + e.showInFor());
            i++;
        }
    }

    void showServiceHouse() {
        List<String[]> houseList = rf.readerFile(AddNewServices.LINK_HOUSE);
        Set<House> services = new TreeSet<>(Comparator.comparing(Services::getNameServices));
        int i = 1;
        for (String[] service : houseList) {
            House house = new House();

            house.setNameServices(service[0]);
            house.setAreaUsed(Double.parseDouble(service[1]));
            house.setRentalCost(Double.parseDouble(service[2]));
            house.setNumberOfPeople(Integer.parseInt(service[3]));
            house.setTypeOfRent(service[4]);
            house.setStandardRoom(service[5]);
            house.setOtherFacilities(service[6]);
            house.setNumberOfFloor(Integer.parseInt(service[7]));

            services.add(house);
        }
        for (House house : services) {
            System.out.println(i + "-- " + house.showInFor());
            i++;
        }
    }

    void showServiceRoom() {
        List<String[]> roomList = rf.readerFile(AddNewServices.LINK_ROOM);
        Set<Room> services = new TreeSet<>(Comparator.comparing(Services::getNameServices));
        int i = 1;
        for (String[] service : roomList) {
            Room room = new Room();

            room.setNameServices(service[0]);
            room.setAreaUsed(Double.parseDouble(service[1]));
            room.setRentalCost(Double.parseDouble(service[2]));
            room.setNumberOfPeople(Integer.parseInt(service[3]));
            room.setTypeOfRent(service[4]);
            room.setFreeServices(service[5]);

            services.add(room);
        }
        for (Room room : services) {
            System.out.println(i + " -- " + room.showInFor());
            i++;
        }
    }
}

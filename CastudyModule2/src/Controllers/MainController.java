package Controllers;

import Commons.RegularExpression;
import Models.Customer;

import java.util.Scanner;

public class MainController {
    Scanner scanner = new Scanner(System.in);

    void displayMainMenu() {
        System.out.println("1. Add New Services\n" +
                "2.Show Services\n" +
                "3.Add New Customer\n" +
                "4.Show Information of Customer\n" +
                "5.Add New Booking\n" +
                "6.Show Information of Employee\n" +
                "7.Exit");
        int menu = Integer.parseInt(scanner.nextLine());
        switch (menu) {
            case 1:

            case 2:

            case 3:

            case 4:

            case 5:

            case 6:

            case 7:
        }
    }

    public static void main(String[] args) throws Exception {
    AddNewBooking addNewBooking = new AddNewBooking();
    addNewBooking.addNewBooking(addNewBooking.bookingVilla());
//AddNewServices addNewServices = new AddNewServices();
//addNewServices.addNewHouse();
    }
}

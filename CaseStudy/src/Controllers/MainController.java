package Controllers;

import Models.Services;
import Models.Villa;

import javax.imageio.stream.ImageInputStream;
import java.util.Scanner;

public class MainController {

    void displayMainMenu() {
        Scanner scanner = new Scanner(System.in);
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
                AddNewServices addNewServices = new AddNewServices();
                addNewServices.addNewServicesMenu();
            case 2:
                ShowServices showServices=new ShowServices();
                showServices.showServicesMenu();
            case 3:

            case 4:
            case 5:
            case 6:
            case 7:
            default:
        }
    }
    public static void main(String[] args) {
        MainController mcl=new MainController();
        mcl.displayMainMenu();
    }
}


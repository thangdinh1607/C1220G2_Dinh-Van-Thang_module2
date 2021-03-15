package Controllers;

import Models.Services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ShowServices {
    public static final String LINK_VILLA = "F:\\C1220G2_Dinh-Van-Thang_module2\\CaseStudy\\src\\Data\\Villa.csv";
    public static final String LINK_HOUSE = "F:\\C1220G2_Dinh-Van-Thang_module2\\CaseStudy\\src\\Data\\House.csv";
    public static final String LINK_ROOM = "F:\\C1220G2_Dinh-Van-Thang_module2\\CaseStudy\\src\\Data\\Room.csv";

    void showServicesMenu() {
        MainController mainMenu = new MainController();
        Scanner input = new Scanner(System.in);

        System.out.println("1.Show all Villa\n" +
                "2.Show all House\n" +
                "3.Show all Room\n" +
                "4.Show All Name Villa Not Duplicate\n" +
                "5.Show All Name House Not Duplicate\n" +
                "6.Show All Name Name Not Duplicate\n" +
                "7.Back to menu\n" +
                "8.Exit");
        int menu = Integer.parseInt(input.nextLine());
        switch (menu) {
            case 1:
                readFileServices(LINK_VILLA);
                break;
            case 2:
                readFileServices(LINK_HOUSE);
                break;
            case 3:
                readFileServices(LINK_ROOM);
                break;
            case 4:
            case 5:
            case 6:
            case 7:
                mainMenu.displayMainMenu();
                break;
            case 8:
                System.out.println("Exit");
            default:
                System.out.println("Input false");
                mainMenu.displayMainMenu();
        }
    }

    void readFileServices(String linkFile) {
        ReaderFile rd = new ReaderFile();
        List<String> arrayList = new ArrayList<>(rd.readerFile(linkFile));
        for (String arr : arrayList) {
            System.out.println(arr);
        }
    }
}


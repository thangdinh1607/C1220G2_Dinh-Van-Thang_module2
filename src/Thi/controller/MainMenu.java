package Thi.controller;

import java.util.Scanner;

public class MainMenu {
    Scanner scanner = new Scanner(System.in);
    void mainMenu(){
        System.out.println("---CHUONG TRINH QUAN LY SINH VIEN ---- ");
        System.out.println("Chon chuc nang theo so : " +"\n"+
                "1.Them moi sinh vien" +"\n"+
                "2.xoa sinh vien" +"\n"+
                "3.xem danh sach sinh vien" +"\n"+
                "4.xem thong tin giao vien" +"\n"+
                "5.tim kiem sinh vien" +"\n"+
                "6.thoat");
        int menu = Integer.parseInt(scanner.nextLine());
        switch (menu){
            case 1:
                AddNewStudent addNewStudent = new AddNewStudent();
                addNewStudent.addNewStudent();
                break;
            case 2:

            case 3:
                ShowStudent showStudent = new ShowStudent();
                showStudent.showStudent();
                break;
            case 4:

            case 5:

            case 6:
        }
    }

    public static void main(String[] args) {
        MainMenu mainMenu = new MainMenu();
        mainMenu.mainMenu();
    }
}

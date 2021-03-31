package Thi.controller;

import Thi.person.Student;
import netscape.javascript.JSUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AddNewStudent {
    public static final String LINK_STUDENT = "F:\\C1220G2_Dinh-Van-Thang_module2\\src\\Thi\\data\\student.csv";
    public static final String NAME_STUDENT = "^\\w{4,50}$";
    public static final String BIRTHDAY = "^(([0-2]\\d)|3(0|1))(/|.)((0[\\d])|(1[0-2]))(/|.)((19\\d\\d)|(200[0-3]))$";
    public static final String PHONE_NUMBER = "^(090|091)\\d{7}$";
    Pattern pattern;
    Matcher matcher;
    Scanner scanner = new Scanner(System.in);
    ReadFile readFile = new ReadFile();

    void addNewStudent() {

        int idStudent = readFile.readerFile(LINK_STUDENT).size() + 1;

        String nameStudent;
        do {
            System.out.println("Enter name Student :");
            nameStudent = scanner.nextLine();
        } while (!Pattern.compile(NAME_STUDENT).matcher(nameStudent).matches());

        String birthDayStudent;
        do {
            System.out.println("Enter Birth day Student :");
            birthDayStudent = scanner.nextLine();
        } while (!Pattern.compile(BIRTHDAY).matcher(birthDayStudent).matches());


        System.out.println("Enter gender student :");
        String genderStudent = scanner.nextLine();

        String phoneNumberStudent;
        do {
            System.out.println("Enter phone number of student");
            phoneNumberStudent = scanner.nextLine();
        } while (!Pattern.compile(PHONE_NUMBER).matcher(phoneNumberStudent).matches());


        System.out.println("Enter id class :");
        int idClassRoom = Integer.parseInt(scanner.nextLine());


        Student student = new Student(nameStudent, birthDayStudent, genderStudent, Integer.parseInt(phoneNumberStudent) , idClassRoom, idStudent);
        WriteFile writeFile = new WriteFile();
        writeFile.writeFile(LINK_STUDENT, student);
    }
}

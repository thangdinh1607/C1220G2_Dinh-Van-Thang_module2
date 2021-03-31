package Thi.controller;

import Thi.person.Student;

import java.util.List;

public class ShowStudent {
    void showStudent() {
        ReadFile rf = new ReadFile();
        List<String[]> readerList = rf.readerFile(AddNewStudent.LINK_STUDENT);
        Student student = new Student();
        for (String[] std : readerList) {
            student.setName(std[1]);
            student.setBirthDay(std[2]);
            student.setGender(std[3]);
            student.setPhoneNumber(Integer.parseInt(std[4]) );
            student.setClassRoom(Integer.parseInt(std[0]) );

            System.out.println( student);

        }
    }
}

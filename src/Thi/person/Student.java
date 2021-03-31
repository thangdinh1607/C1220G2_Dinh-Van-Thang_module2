package Thi.person;

public class Student extends Person {
    private int idStudent;
    private int idClassRoom;

    public Student(String name, String birthDay, String gender, int phoneNumber, int idStudent, int classRoom) {
        super(name, birthDay, gender, phoneNumber);
        this.idStudent = idStudent;
        this.idClassRoom = classRoom;
    }

    public Student(int idStudent, int classRoom) {
        this.idStudent = idStudent;
        this.idClassRoom = classRoom;
    }

    public Student() {

    }


    public int getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(int idStudent) {
        this.idStudent = idStudent;
    }

    public int getClassRoom() {
        return idClassRoom;
    }

    public void setClassRoom(int classRoom) {
        this.idClassRoom = classRoom;
    }

    @Override
    public String toString() {
        return +idStudent + "," +
                super.toString() + ","
                + idClassRoom;
    }
}

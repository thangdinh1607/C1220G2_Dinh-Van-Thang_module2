package Thi.person;

public class ClassRoom {
    private int idClassRoom;
    private String nameClassRoom;
    private int idTeacher;

    public ClassRoom(int idClassRoom, String nameClassRoom, int idTeacher) {
        this.idClassRoom = idClassRoom;
        this.nameClassRoom = nameClassRoom;
        this.idTeacher = idTeacher;
    }

    public ClassRoom() {
    }

    public int getIdClassRoom() {
        return idClassRoom;
    }

    public void setIdClassRoom(int idClassRoom) {
        this.idClassRoom = idClassRoom;
    }

    public String getNameClassRoom() {
        return nameClassRoom;
    }

    public void setNameClassRoom(String nameClassRoom) {
        this.nameClassRoom = nameClassRoom;
    }

    public int getIdTeacher() {
        return idTeacher;
    }

    public void setIdTeacher(int idTeacher) {
        this.idTeacher = idTeacher;
    }

    @Override
    public String toString() {
        return "ClassRoom{" +
                "idClassRoom=" + idClassRoom +
                ", nameClassRoom='" + nameClassRoom + '\'' +
                ", idTeacher=" + idTeacher +
                '}';
    }
}

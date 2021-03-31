package Thi.person;

public class Teacher extends Person {
    private int idTeacher;

    public Teacher(String name, String birthDay, String gender, int phoneNumber, int idTeacher) {
        super(name, birthDay, gender, phoneNumber);
        this.idTeacher = idTeacher;
    }

    public Teacher(int idTeacher) {
        this.idTeacher = idTeacher;
    }

    public int getIdTeacher() {
        return idTeacher;
    }

    public void setIdTeacher(int idTeacher) {
        this.idTeacher = idTeacher;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "idTeacher=" + idTeacher +
                "} " + super.toString();
    }
}

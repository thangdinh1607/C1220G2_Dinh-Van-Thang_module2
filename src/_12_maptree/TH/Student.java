package _12_maptree.TH;

import java.util.*;

public class Student {
    private String name;
    private int  age;
    private String address;

    public Student() {
    }

    public Student(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }

}
class Main {
    public static void main(String[] args) {
        Student std1 = new Student("d", 18, "Đà Nẵng");
        Student std2 = new Student("a", 19, "Hà Nội");
        Student std3 = new Student("c", 16, "Sài Gòn");

        Map<Integer, Student> studentMap = new HashMap<>();
        studentMap.put(1, std1);
        studentMap.put(2, std2);
        studentMap.put(3, std3);

        for (Map.Entry<Integer, Student> std : studentMap.entrySet()) {
            System.out.println(std.toString());
        }

        System.out.println("------------------------");
        Set<Student> students = new HashSet<Student>();
        students.add(std1);
        students.add(std2);
        students.add(std3);
        students.add(std3);

        for(Student student : students){
            System.out.println(student.toString());
        }
    }
}

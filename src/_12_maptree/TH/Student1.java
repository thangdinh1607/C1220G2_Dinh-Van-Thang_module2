package _12_maptree.TH;

import java.util.*;

public class Student1 implements Comparable<Student1>{
    private String name;
    private int age;
    private String address;

    public Student1() {
    }

    public Student1(String name, int age, String address) {
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
        return "Student1{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student1 o) {
        return getName().compareTo(o.getName());
    }
}
class AgeComparator implements Comparator<Student1>{
    @Override
    public int compare(Student1 o1, Student1 o2) {
       return o1.getAge() - o2.getAge();
    }
        public static void main(String[] args) {
            Student1 student1 = new Student1("b", 31, "HT");
            Student1 student2 = new Student1("d", 28, "HT");
            Student1 student3 = new Student1("a", 29, "HT");
            Student1 student4 = new Student1("c", 55, "HT");



            List<Student1> lists = new ArrayList<>();
            lists.add(student1);
            lists.add(student2);
            lists.add(student3);
            lists.add(student4);
            Collections.sort(lists);
            for(Student1 st : lists){
                System.out.println(st.toString());
            }

            AgeComparator ageComparator = new AgeComparator();
            Collections.sort(lists,ageComparator);
            System.out.println("so sánh theo tuôi");
            for(Student1 std : lists){
                System.out.println(std.toString());
            }
        }
}


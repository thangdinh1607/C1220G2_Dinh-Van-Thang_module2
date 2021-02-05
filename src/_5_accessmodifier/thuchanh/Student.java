package _5_accessmodifier.thuchanh;

public class Student {
    private String name;
    private int group;
    static private String school;


    Student(String name ,int group){
        this.name=name;
        this.group=group;
    }


    static void change(){
        school="leloi";
    }
    void display(){
        System.out.println(name + "---"+group+"---"+school);
    }
}
class TestStaticMethod {
    public static void main(String[] args) {
        Student.change();

        Student student1= new Student("dinh",7);
        Student student2= new Student("hh",717);
        Student student3= new Student("tttt",777);

        student1.display();
        student2.display();
        student3.display();
    }
}

package _5_accessmodifier.thuchanh;

public class Person {
    public String name = "thangdinh";
    private int age = 18;
    public void Hello() {
        System.out.println("Hello2021");

    }
}
class Simple {
    public static void main(String[] args) {
        Person obj = new Person();
//        System.out.println(obj.age);
        System.out.println(obj.name);
        obj.Hello();
    }
}

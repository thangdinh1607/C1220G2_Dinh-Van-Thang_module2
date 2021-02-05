package _5_accessmodifier.tesst;

import _5_accessmodifier.thuchanh.Person;

class A extends Person {
    public static void main(String[] args) {
        Person obj =new Person();
        System.out.println(obj.name);
//        System.out.println(obj.age);
        obj.Hello();
    }
}

package _1_intruction_to_java.bai_tap;

import java.util.Scanner;

public class Sayhello {
    public static void main(String[] args) {
        String name;
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter your name : ");
        name=scanner.nextLine();

        System.out.println("Hello: " + name);
    }
}

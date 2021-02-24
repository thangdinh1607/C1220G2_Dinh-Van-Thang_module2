package _6_inheritance.bt;

import java.util.Scanner;

public class Triangle extends Shape {
    private double side1=1.0;
    private double side2=1.0;
    private double side3=1.0;

    public Triangle(String color, double side1, double side2, double side3) {
        super(color);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }
    public double getPerimeter(){
        return side1+side2+side3;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "Perimeter = " + getPerimeter() +
                "} " + super.toString();
    }
}

class Test1{
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);

        System.out.println("color = ");
        String color =input.next();
        System.out.println("side1 =");
        double side1 =input.nextDouble();
        System.out.println("side2 =");
        double side2 =input.nextDouble();
        System.out.println("side3 =");
        double side3 =input.nextDouble();


        Triangle triangle = new Triangle(color,side1,side2,side3);

        System.out.println(triangle.toString());
    }
}


package _4_OOP.baitap;

import java.util.Scanner;

public class QuadraticEquation {
    double a, b, c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getDiscriminant() {
        return b * b - 4 * a * c;
    }

    public double getRoot1() {
        return (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / 2 * a;
    }

    public double getRoot2() {
        return (b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / 2 * a;
    }

    public double getDoubleRoot() {
        return -b / 2 * a;
    }

    public static void main(String[] args) {
        double a, b, c;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a :");
        a = input.nextDouble();
        System.out.println("Enter b :");
        b = input.nextDouble();
        System.out.println("Enter c :");
        c = input.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        if (quadraticEquation.getDiscriminant() > 0) {
            System.out.println("The equation has tow root" + quadraticEquation.getRoot1() + "----and---- " + quadraticEquation.getRoot2());
        } else if (quadraticEquation.getDiscriminant() == 0) {
            System.out.println("The equation has double root x1 =x2 = " + quadraticEquation.getDoubleRoot());
        } else {
            System.out.println("The equation has no roots");
        }
    }
}

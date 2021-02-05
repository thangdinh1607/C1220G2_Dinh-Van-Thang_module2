package _5_accessmodifier.baitap;

public class Circle {
    private double radius = 1.0;
    private String color = "red";

    Circle() {
    }

    Circle(double r) {
        this.radius = r;
    }

    public double getRadius() {
        return radius;
    }

    public double getArena() {
        return this.radius * this.radius * Math.PI;

    }
}

class TestCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle(10);
        Circle c2 = new Circle(20);
        System.out.println(c1.getRadius());
        System.out.println(c2.getRadius());
        System.out.println(c1.getArena());
        System.out.println(c2.getArena());

    }
}
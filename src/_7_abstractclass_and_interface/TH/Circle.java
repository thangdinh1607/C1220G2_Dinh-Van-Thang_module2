package _7_abstractclass_and_interface.TH;

import java.util.Arrays;
import java.util.Comparator;

public class Circle {
    private double radius;
    private String color;
    private boolean filler;

    public Circle() {
    }

    public Circle(double radius, String color, boolean filler) {
        this.radius = radius;
        this.color = color;
        this.filler = filler;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFiller() {
        return filler;
    }

    public void setFiller(boolean filler) {
        this.filler = filler;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                ", filler=" + filler +
                '}';
    }
}
class ComparableCircle extends Circle implements Comparable<ComparableCircle>{
    public ComparableCircle() {
    }

    public ComparableCircle(double radius, String color, boolean filler) {
        super(radius, color, filler);
    }

    @Override
    public int compareTo(ComparableCircle o) {
        if (getRadius()>o.getRadius()) return 1;
        else if (getRadius() < o.getRadius()) return -1;
        else return 1;
    }

//    @Override
//    public String toString() {
//        return "ComparableCircle{} " + super.toString();
//    }
}
class SortColor implements Comparator {
    public SortColor() {
    }

    @Override
    public int compare(Object o1, Object o2) {
        ComparableCircle circle1 =(ComparableCircle) o1;
        ComparableCircle circle2 =(ComparableCircle) o2;
        return circle1.getColor().compareTo(circle2.getColor());
    }
}

class TestCircle {
    public static void main(String[] args) {
        ComparableCircle[] circles = new ComparableCircle[3];
        circles[0] = new ComparableCircle(3.5, "c", true);
        circles[1] = new ComparableCircle(15, "a", true);
        circles[2] = new ComparableCircle(10, "b", false);

        System.out.println("Pre-sorted:");
        for (ComparableCircle circle : circles) {
            System.out.println(circle);
        }
        Arrays.sort(circles,new SortColor());

        System.out.println("After-sorted:");
        for (ComparableCircle circle : circles) {
            System.out.println(circle);
        }
    }
}

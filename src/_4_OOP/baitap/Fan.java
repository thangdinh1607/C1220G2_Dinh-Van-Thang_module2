package _4_OOP.baitap;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import jdk.internal.org.objectweb.asm.tree.MultiANewArrayInsnNode;

public class Fan {
    static final int SLOW = 1, MEDIUM = 2, FAST = 3;

    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    Fan() {

    }

    Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
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

    public String toString() {
        if (this.on) {
            return this.speed + " " + this.radius + " " + this.color + " Fan is on";
        } else {
            return "Fan is off";
        }

    }
    public static void main(String[] args) {
        Fan fan2 = new Fan(MEDIUM, true, 5, "green");
        System.out.println(fan2.toString());
    }

}

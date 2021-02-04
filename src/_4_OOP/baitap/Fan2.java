package _4_OOP.baitap;

public class Fan2 {
    static final int slow = 1, medium = 2, fast = 3;
    private int speed = slow;
    private boolean on = false;
    private double radius = 6;
    private String color = "yellow";

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
        Fan2 fan1 = new Fan2();
        fan1.setSpeed(fast);
        fan1.setColor("blue");
        fan1.setOn(true);
        fan1.setRadius(10);
        System.out.println(fan1.toString());
    }
}

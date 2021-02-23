package _6_inheritance.bt;


public class ClassCircle {
    private double radius ;
    private String color;

    public ClassCircle(){
    }
    public ClassCircle(double radius, String color) {
        this.radius = radius;
        this.color = color;
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
    public double getPerimeter(){
        return this.radius*2*Math.PI;
    }
    public double getArea(){
        return this.radius*this.radius*Math.PI;
    }

    @Override
    public String toString() {
        return "ClassCircle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                "Area :" + getArea();
    }
}
class Cylinder extends ClassCircle{
    private double height;

    public Cylinder(){
    }

    public Cylinder(double height) {
        this.height = height;
    }
    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }
    public double getVolume(){
        return this.height*this.getArea();
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height +
                "Volume :" +getVolume() ;
    }
}
class Test {
    public static void main(String[] args) {
        ClassCircle circle = new ClassCircle(5.0,"blue");
        System.out.println(circle);
        Cylinder cylinder=new Cylinder(4.0,"red",1.0);
        System.out.println(cylinder);
    }
}

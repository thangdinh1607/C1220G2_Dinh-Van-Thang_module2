package _7_abstractclass_and_interface.BT;

public class Shape implements Resizeable {
    private String color="green";
    private boolean filled=true;

    public Shape(){
    }
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' + "and "+
                 (isFilled() ? "filled" : "not filled");
    }

    @Override
    public void resize(double percent) {
    }
}
class Circle extends Shape implements Resizeable{
    private double radius=1.0;

    public Circle(){
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return radius*radius*Math.PI;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                "} " + super.toString();
    }

    @Override
    public void resize(double percent) {
        double newCircle = this.getArea() * (percent / 100);
        System.out.println(newCircle);
        System.out.println();
    }
}
class Rectangle extends Shape implements Resizeable{
    private double width=1.0;
    private double height=2.0;
    public Rectangle(){
    }
    public Rectangle(String color, boolean filled, double width, double height) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getArea(){
        return height*width;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                "} " + super.toString();
    }

    @Override
    public void resize(double percent) {
        double newRectangle = this.getArea() * (percent / 100);
        System.out.println(newRectangle);
        System.out.println();
    }
}
class Square extends Shape implements Resizeable{
    private double side=1.0;

    public Square(){
    }
    public Square(String color, boolean filled, double side) {
        super(color, filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
    public double getArea(){
        return side*side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                "} " + super.toString();
    }

    @Override
    public void resize(double percent) {
        double newSquare = this.getArea() * (percent / 100);
        System.out.println(newSquare);
        System.out.println();
    }
}



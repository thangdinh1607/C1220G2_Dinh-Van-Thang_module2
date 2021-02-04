package _4_OOP.thuchanh;

import java.util.Scanner;

public class Rectangle {
    double width;
    double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double acreageRectangle() {
        return this.width * this.height;
    }

    public double perimeterRectangle() {
        return (this.width + this.height) * 2;
    }
    public String display() {
        return "Rectangle{" + "width=" + width + ", height=" + height + "}";
    }
}



package _2_loop.baitap;

import java.util.Scanner;

public class ShowGeometry {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        byte a,height,weight;
        System.out.println("1.Print the rectangle ");
        System.out.println("2.Print the square triangle");
        System.out.println("3.Print isosceles triangle");
        System.out.println("4.Exit");

        System.out.println("Input number :");
        a=input.nextByte();


        switch (a){
            case 1 :
                System.out.println("1.Print the rectangle ");
                System.out.println("Enter height :");
                height=input.nextByte();
                System.out.println("Enter weight :");
                weight=input.nextByte();
                for(byte i =0;i<height;i++){
                    System.out.println(" ");
                    for(byte j=0;j<weight;j++){
                        System.out.print(" hi ");
                    }
                }
                break;
            case 2 :
                System.out.println("2.Print the square triangle");
                System.out.println("Enter size :");
                height=input.nextByte();
                for(byte i=0;i<=height;i++) {
                    System.out.println(" ");
                    for(byte j=0;j<i;j++) {
                        System.out.print(" hi ");
                    }
                }
                break;
            case 3 :
                System.out.println("3.Print isosceles triangle");
                System.out.println("Enter size :");
                height=input.nextByte();
                for(byte i=height;i>0;i--) {
                    System.out.println(" ");
                    for(byte j=0;j<i;j++){
                        System.out.print(" hi ");
                    }
                }
                break;
            case 4 :
                System.out.println("Exit");
                break;
            default:
                System.out.println("False");
        }
    }
}

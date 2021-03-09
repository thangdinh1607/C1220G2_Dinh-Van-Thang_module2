package _15_debug_and_exception.TH;

import java.util.Scanner;

public class CalculationExample {
    void calculate(int x ,int y){
        try{
            int a = x+y;
            int b = x-y;
            int c = x*y;
            int d = x/y;
            System.out.println("Sum " +a);
            System.out.println("Subtract "+b);
            System.out.println("Multiplication "+c);
            System.out.println("Division "+d);
        }catch (Exception e){
            System.out.println("Exception --" + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter x ");
        int x =input.nextInt();
        System.out.println("Enter y");
        int y =input.nextInt();
        CalculationExample calculationExample = new CalculationExample();
        calculationExample.calculate(x,y);
    }
}


package _3_array_and_method.thuchanh;

import java.util.Scanner;

public class CoverTemperature {

    public static double celsiusToFahrenheit(double c) {
        double f = (9.0 / 5) * c + 32;
        return f;
    }

    public static double fahrenheitToCelsius(double f) {
        double c = (5.0 / 9) * (f - 32);
        return c;
    }

    public static void main(String[] args) {
        double f;
        double c;
        int number;

        Scanner input = new Scanner(System.in);

        System.out.println("Menu Cover Temperature ");
        System.out.println("1.Fahrenheit to Celsius");
        System.out.println("2.Celsius to Fahrenheit");
        System.out.println("Enter Number :");
        number = input.nextInt();

        switch (number) {
            case 1:
                System.out.println("Enter Celsius :");
                c = input.nextDouble();
                System.out.println(c + "F =" + celsiusToFahrenheit(c) + "C");
                break;
            case 2:
                System.out.println("Enter Fahrenheit :");
                f = input.nextDouble();
                System.out.println(f + "C =" + fahrenheitToCelsius(f) + "F");
                break;
            case 0:

                break;
            default:
                System.out.println("False");
        }
    }
}

package _2_loop.thuchanh;

import java.util.Scanner;

public class CheckForPrimeNumbers {
    public static void main(String[] args) {

        int n;
        int count = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input number :");
        n = scanner.nextInt();
        if (n <= 2 && n >= 0) {
            System.out.println(n + " is prime number");
        } else if(n>2) {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    count++;
                    break;
                }
            }
            if (count > 0) {
                System.out.println(n + " is not prime number");
            } else {
                System.out.println(n + " is prime number");
            }
        }
    }
}
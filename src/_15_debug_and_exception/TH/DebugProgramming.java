package _15_debug_and_exception.TH;

import java.util.Scanner;

public class DebugProgramming {
    public static void main(String[] args) {
        int a, b;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input a : ");
        a = scanner.nextInt();
        System.out.println("Input b : ");
        b = scanner.nextInt();

        a = Math.abs(a);
        b = Math.abs(b);

        if(a!=0 && b!=0){
            if (a > b) {
                for (int i = b; i > 0; i--) {
                    if (a % i == 0 && b % i == 0) {
                        System.out.println("Max common divisor : " + i);
                        break;
                    }
                }
            } else {
                for (int i = a; i > 0; i--) {
                    if (a % i == 0 && b % i == 0) {
                        System.out.println("Max common divisor " + i);
                        break;
                    }
                }
            }
        }else if(a==0 && b==0){
            System.out.println("No greatest common factor");
        }else{
            System.out.println("Max common divisor is : 0");
        }
    }
}

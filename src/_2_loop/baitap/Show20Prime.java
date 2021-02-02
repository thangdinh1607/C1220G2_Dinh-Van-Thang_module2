package _2_loop.baitap;

import java.util.Scanner;

public class Show20Prime {
    public static void main(String[] args) {
        int numbers;
        int count;
        int count1=0;
        int n=2;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input number of numbers :");
        numbers = scanner.nextInt();
        while (count1<numbers) {
            count=0;
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    count++;
                    break;
                }
            }
            if (count == 0) {
                System.out.println(n);
                    count1++;
            }
            n++;
        }
    }
}

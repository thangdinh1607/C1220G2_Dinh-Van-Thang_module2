package _3_array_and_method.thuchanh;

import java.util.Scanner;

public class FindValueIsMax {
    public static void main(String[] args) {
        int size;
        int max;
        Scanner input = new Scanner(System.in);


        do {
            System.out.println("Enter number of numbers (<=20):");
            size = input.nextInt();
            if (size > 20) {
                System.out.println("Enter false");
            }
        } while (size > 20);

        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter number " + (i + 1) + " :");
            array[i] = input.nextInt();
        }
        max = array[0];
        int i;
        for (i = 0; i < size; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Number is max : " + max + " index = " + i);
    }
}

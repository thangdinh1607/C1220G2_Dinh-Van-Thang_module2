package _3_array_and_method.baitap;

import java.util.Scanner;

public class FindElementMax {
    public static double[][] addNumber(double[][] arr) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.println("Input Number " + " i = " + i + " j= " + j);
                arr[i][j] = input.nextInt();
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int x;
        int y;
        int i;
        int j;
        double max;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter weight ");
        x = input.nextInt();
        System.out.println("Enter height ");
        y = input.nextInt();

        double[][] array = new double[x][y];
        addNumber(array);
        max = array[0][0];
        for (i = 0; i < array.length; i++) {
            for (j = 0; j < array.length; j++) {
                if (max < array[i][j]) {
                    max = array[i][j];
                }
            }
        }
        System.out.println("Value is Max :" + max);
    }
}

package _3_array_and_method.baitap;

import java.util.Scanner;

public class CombineArray {
    public static int[] addNumberToArray(int[] arr) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Input number " + (i + 1) + ":");
            arr[i] = input.nextInt();
        }
        return arr;
    }

    public static void main(String[] args) {
        int size1;
        int size2;
        int count = 0;
        Scanner input = new Scanner(System.in);


        System.out.println("Enter number of numbers Array1 : ");
        size1 = input.nextInt();
        int[] array1 = new int[size1];
        addNumberToArray(array1);

        System.out.println("Enter number of numbers Array2: ");
        size2 = input.nextInt();
        int[] array2 = new int[size2];
        addNumberToArray(array2);

        int[] array3 = new int[size1 + size2];

        for (int i = 0; i < array1.length; i++) {
            array3[i] = array1[i];
        }
        for (int i = 0; i < array2.length; i++) {
            array3[array1.length + i] = array2[i];
        }

        System.out.println("Element of Array3 :");
        for (int i : array3) {
            System.out.println(i);
        }
    }
}

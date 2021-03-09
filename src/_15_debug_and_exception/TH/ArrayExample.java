package _15_debug_and_exception.TH;

import java.util.Random;
import java.util.Scanner;

public class ArrayExample {
    int[] createRandom() {
        Random rd = new Random();
        int[] arr = new int[100];
        System.out.println("List of element :");
        for (int i = 0; i < arr.length; i++) {
               arr[i]=rd.nextInt(100);
            System.out.print(arr[i] + "--");
        }
        return arr;
    }

    public static void main(String[] args) {
        ArrayExample arrayExample = new ArrayExample();
        int []arr =arrayExample.createRandom();

        Scanner input = new Scanner(System.in);
        System.out.println();
        System.out.println("Enter a Number :");
        int x =input.nextInt();

        try{
            System.out.println("value of element on index " + x +" is " + (int)arr[x] );
        }catch (IndexOutOfBoundsException e){
            System.out.println("IndexOutOfBoundsException");
        }
    }
}

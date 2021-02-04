package _3_array_and_method.baitap;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class FindElementMin {
    public static int[] addNumber(int[] arr) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter number " + (i + 1) + ":");
            arr[i] = input.nextInt();
        }
        return arr;
    }

    public static void main(String[] args) {
        int size;
        int min;
        Scanner input = new Scanner(System.in);


        System.out.println("Enter Numbers of Array :");
        size = input.nextInt();
        int[] array = new int[size];
        addNumber(array);
        min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        System.out.println("Value is Min " + min);

    }
}

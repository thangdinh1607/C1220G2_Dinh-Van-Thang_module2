package _3_array_and_method.baitap;

import java.util.Scanner;

public class DeleteElement {
    public static int[] deleteElement(int[] arr, int x) {
        for (int i = x; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] array = {1, 1, 3, 3, 5, 6, 7, 8, 9, 0, 0, 2};
        int x;
        int index;
        int count=0;
        Scanner input = new Scanner(System.in);


        System.out.println("Enter Number  :");
        x = input.nextInt();
        for (int i = 0; i < array.length; i++) {

            if (array[i] == x) {
                if (i < array.length-1) {
                    index = i;
                    for (int j : deleteElement(array, index)) {
                        System.out.println(j);
                    }
                    count++;
                    break;
                }else{
                    array[array.length-1]=0;
                    index=array.length-1;
                    for (int j : deleteElement(array, index)) {
                        System.out.println(j);
                    }
                    count++;
                    break;
                }
            }
        }
        if (count==0){
            System.out.println(x +" not in the Array");
        }
    }
}
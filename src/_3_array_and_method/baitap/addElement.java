package _3_array_and_method.baitap;

import java.util.Scanner;

public class addElement {
    public static int[]addElement(int[]arr,int x) {
        for(int i=arr.length-1;i>x;i--) {
            arr[i]=arr[i-1];
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] array = {1, 1, 3, 3, 5, 6, 7, 8, 9, 0, 0, 0};
        int number;
        int index;
        Scanner input =new Scanner(System.in);


    System.out.println("Enter number :");
    number=input.nextInt();
    System.out.println("Enter number index :");
    index=input.nextInt();

    if(index<array.length){
        addElement(array,index);
        array[index]=number;
    for (int i:array) {
        System.out.println(i);
    }
    }else{
        System.out.println("can't add number on index ="+index);
    }

    }
}

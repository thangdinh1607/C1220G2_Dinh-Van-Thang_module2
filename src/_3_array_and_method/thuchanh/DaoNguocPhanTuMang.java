package _3_array_and_method.thuchanh;

import java.util.Scanner;

public class DaoNguocPhanTuMang {
    public static void main(String[] args) {
        int size;
        Scanner input =new Scanner(System.in);


        do{
            System.out.println("Enter number of Number (<=20):");
            size=input.nextInt();
            if(size>20){
                System.out.println("Enter false ");
            }
        }while(size>20);

        int[]array=new int[size];
        for(int i=0;i<size ;i++) {
            System.out.println("Enter number "+ (i+1) +" :");
            array[i]=input.nextInt();
        }

        for(int i=0;i<array.length/2;i++) {
            int temp=array[i];
            array[i]=array[array.length -1 - i];
            array[array.length -1-i]=temp;
        }

        System.out.println("Reverse number :");
        for(int i=0;i<array.length;i++) {
            System.out.println(array[i]);
        }
    }
}


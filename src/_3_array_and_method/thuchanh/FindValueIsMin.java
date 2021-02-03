package _3_array_and_method.thuchanh;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;
public class FindValueIsMin {
    public static int minValue(int[]arr){
        int min=arr[0];
        int i;
        for(i=0 ;i<arr.length;i++){
            if (arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int size;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter number of Numbers :");
        size=input.nextInt();
        int[]array = new int [size];
        for(int i=0;i<size;i++) {
            System.out.println("Enter number "+(i+1) +" :");
            array[i]=input.nextInt();
        }
        System.out.println("Min value : " + minValue(array));
    }
}

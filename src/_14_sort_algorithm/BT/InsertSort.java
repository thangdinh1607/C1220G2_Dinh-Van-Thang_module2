package _14_sort_algorithm.BT;

import java.util.Arrays;

public class InsertSort {
    int[] insertSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int j=i-1;
            int value =arr[i];
            while (j >=0 && arr[j]>value){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=value;
        }
        return arr;

    }

    public static void main(String[] args) {
        int []arrayOfNumber ={4,3,5,7,6,7,1,8,2};
        InsertSort insertSort=new InsertSort();
        System.out.println(Arrays.toString(insertSort.insertSort(arrayOfNumber)));

    }
}

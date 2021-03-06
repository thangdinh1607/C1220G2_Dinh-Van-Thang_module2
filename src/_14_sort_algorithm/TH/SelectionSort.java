package _14_sort_algorithm.TH;

import java.util.Arrays;
import java.util.LinkedList;

public class SelectionSort {
     int[] selectionSort(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            int  indexMin = i;
            int min=arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                    if (min > arr[j]) {
                        min = arr[j];
                        indexMin = j;
                }
            }
            if(indexMin!=i){
                arr[indexMin]=arr[i];
                arr[i]=min;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int []arrayOfNumber = {9,7,8,6,5,3,4,1,2,1,8};
        SelectionSort selectionSort=new SelectionSort();
        System.out.println(Arrays.toString(selectionSort.selectionSort(arrayOfNumber)));
    }
}
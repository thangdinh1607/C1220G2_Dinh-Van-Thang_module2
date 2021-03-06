package _14_sort_algorithm.TH;

import java.util.Arrays;

public class BubbleSort {
    int[] bubbleSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

            return arr;
        }
    public static void main(String[] args) {
        int[]arrayOfNumber ={2,1,5,8,7,6,4};
        BubbleSort bubbleSort=new BubbleSort();

        System.out.println(Arrays.toString(bubbleSort.bubbleSort(arrayOfNumber)));
    }
}

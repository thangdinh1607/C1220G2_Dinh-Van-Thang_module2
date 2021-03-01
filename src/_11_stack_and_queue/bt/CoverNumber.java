package _11_stack_and_queue.bt;

import java.util.Arrays;
import java.util.Stack;

public class CoverNumber {
    public int[] coverDecimalToBinary(int n){
        Stack <Integer> stack =new Stack<>();
        while (n>0){
            if(n %2==0){
                stack.push(0);
            }else
                stack.push(1);
            n=n/2;
        }
        int [] array = new int[stack.size()];
        for(int i=0;i<array.length;i++){
            array[i]=stack.pop();
        }
        return array;
    }

    public static void main(String[] args) {
            int number = 12;
            CoverNumber coverNumber =new CoverNumber();
        System.out.println(Arrays.toString(coverNumber.coverDecimalToBinary(number)));

    }
}

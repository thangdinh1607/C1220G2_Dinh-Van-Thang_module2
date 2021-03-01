package _11_stack_and_queue.bt;

import java.util.Arrays;
import java.util.Stack;

public class NumberStack {
        public int[] convert(int [] arr){

            Stack<Integer> stack=new Stack();
            for(int i=0;i<arr.length;i++){
                stack.push(arr[i]);
            }

            int [] array = new int [arr.length];

            for(int i=0;i<arr.length;i++){
                array[i]=stack.pop();
            }
            return array;
        }

    public static void main(String[] args) {
        int [] array1= {1,2,3,4,5,6,7};
        NumberStack numberStack =new NumberStack();
        System.out.println(Arrays.toString(numberStack.convert(array1)) );
    }
}


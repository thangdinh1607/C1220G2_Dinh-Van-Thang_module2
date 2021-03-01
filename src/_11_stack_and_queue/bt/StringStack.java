package _11_stack_and_queue.bt;

import java.util.Arrays;
import java.util.Stack;

public class StringStack {
    public static char[] stringStack(String string){
        Stack<Character> wStack = new Stack<>();

        char [] array1 = string.toCharArray();
        char [] array2 = new char[array1.length];

        for(int i=0;i<array1.length;i++){
            wStack.push(array1[i]);
        }
        for(int i=0;i<array1.length;i++){
             array2[i]= wStack.pop();

        }
        return array2;
    }

    public static void main(String[] args) {
        String a ="thangdinh";
//        StringStack name = new StringStack();
        System.out.println(Arrays.toString(stringStack(a)));
    }
}

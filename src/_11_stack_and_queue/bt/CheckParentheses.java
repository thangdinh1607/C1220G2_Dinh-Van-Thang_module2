package _11_stack_and_queue.bt;

import java.util.Stack;

public class CheckParentheses {
    public boolean check(String string) {
        Stack<Character> stack = new Stack<>();
        char[] arrayChar = string.toCharArray();
        String sym=")";
        String left="(";
        for (int i = 0; i < arrayChar.length; i++) {
            if (arrayChar[i] === left) {
                stack.push(arrayChar[i]);
            }else (arrayChar[i] === sym) {
               
                }
            }
        }
    }
}
package _11_stack_and_queue.bt;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Palindrome {
    public String checkPalindrome(String string) {
        boolean check = true;
        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();

        char[] array1 = string.toCharArray();
        char[] arrayStack = new char[array1.length];
        char[] arrayQueue = new char[array1.length];


        for (int i = 0; i < array1.length; i++) {
            stack.push(array1[i]);
            queue.add(array1[i]);
        }
        for (int i = 0; i < arrayStack.length; i++) {
            arrayStack[i] = stack.pop();
        }
        for (int i = 0; i < arrayQueue.length; i++) {
            arrayQueue[i] = queue.poll();
        }

        for (int i = 0; i < array1.length; i++) {
            if (arrayQueue[i] != arrayStack[i]) {
                check = false;
                break;
            }
        }
        if (check) {
            return "Palindrome";
        } else
            return "not Palindrome";
    }

    public static void main(String[] args) {
        String test = "abcddcbbba";
        Palindrome palindrome = new Palindrome();
        System.out.println(palindrome.checkPalindrome(test));
    }
}

package _11_stack_and_queue.th;

public class GenericStackClient {

    public static void stackOfNumber(){
        MyGenericStack<Integer> stack = new MyGenericStack();
        stack.push(1);
        stack.push(3);
        stack.push(2);
        stack.push(4);
        stack.push(5);
        System.out.println("size of stack after push = " + stack.size());

        stack.pop();
        System.out.println("size of stack after pop = " + stack.size());
    }
    public static void stackOfString(){
        MyGenericStack<String> stack = new MyGenericStack();
        stack.push("one");
        stack.push("three");
        stack.push("two");
        stack.push("four");
        stack.push("five");
        System.out.println("size of stack after push = " + stack.size());

        stack.pop();
        System.out.println("size of stack after pop = " + stack.size());
    }

    public static void main(String[] args) {
        System.out.println("1. Stack of integers");

        stackOfNumber();
    }
}
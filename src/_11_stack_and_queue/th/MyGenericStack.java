package _11_stack_and_queue.th;

import java.util.EmptyStackException;
import java.util.LinkedList;

public class MyGenericStack<T> {
    private LinkedList<T> stack;
    private int size;
    public MyGenericStack(){
        stack = new LinkedList();
    }
    public void push(T e){
        stack.addFirst(e);
    }
    public T pop(){
        if(isEmpty()){
            throw new EmptyStackException();
        }else
        return stack.removeFirst();
    }
    public int size(){
        return stack.size();
    }
    public  boolean isEmpty(){
        if(stack.size()==0){
            return true;
        }else
        return  false;
    }
}

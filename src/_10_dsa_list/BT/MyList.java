package _10_dsa_list.BT;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class MyList<E> {
    private int size = 0;
    private final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyList() {
    }

    public MyList(Object[] elements) {
        this.elements = elements;
    }


    public MyList(int capacity) {
        elements = new Object[capacity];
    }

    private void ensureCapa() {
        int newSize = elements.length * 2 + 1;
        elements = Arrays.copyOf(elements, newSize);
    }

    public void add(int index, E element) {
        if (size == elements.length) {
            ensureCapa();
        }
        for (int i = index; i < 10; i++) {
            elements[i + 1] = elements[i];
        }
        elements[index] = element;
    }

    public Object[] remove(int index) {
        for (int i = index; i < 10; i++) {
            elements[i] = elements[i + 1];
        }
        return elements;
    }

    public int size() {
        return this.size;
    }

    public boolean contains(E o) {
        if (size != 0) {
            return true;
        } else
            return false;
    }

    public int indexOf(E o) {
        int i;
        boolean check=false;
        for (i = 0; i < elements.length; i++) {
            if (elements[i] == o) {
                check = true;
                break;
            }
        }
        if (check) {
            return i;
        } else
            return -1;
    }
    boolean checkAdd(E e){
        if(size <= 10){
            return true;
        }else
            return false;
    }
    public E get(int index){
        if(index<0 || index>size){
            throw new IndexOutOfBoundsException("Index: " + index + ", Size " + index );
        }else
        return (E) elements[index];
    }
    public void clear(){

    }

    public static void main(String[] args) {
        MyList<Integer> myList = new MyList<>();

        myList.add(1,1);
        myList.add(2,2);
        myList.add(3,3);
        myList.add(4,4);
        myList.add(5,5);

        System.out.println(myList.size());
    }
}


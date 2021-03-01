package _10_dsa_list.BT;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public void ensureCape() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    public void add(E e, int index) {
        if (size == elements.length) {
            ensureCape();
        }
        this.size++;
        for (int i = size - 1; i > index; i--) {
            elements[i] = elements[i - 1];
        }
        elements[index] = e;
    }

    public void remove(int index) {
        for (int i = index; i < elements.length; i++) {
            elements[i] = elements[i + 1];
        }
    }

    public void size() {
        System.out.println(elements.length);
    }
}








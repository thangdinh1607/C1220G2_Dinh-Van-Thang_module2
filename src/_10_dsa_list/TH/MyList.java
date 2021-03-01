package _10_dsa_list.TH;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY =10;
    private Object elements[];

    public MyList(){
        elements=new Object[DEFAULT_CAPACITY];
    }
    public void addLast(E n){
        if (size == elements.length) {
            ensureCape();
        }
        elements[size++] = n;
    }
    public void ensureCape(){
        int newSize = elements.length*2;
        elements= Arrays.copyOf(elements,newSize);
    }
    public E get(int index){
       if(index>=size && index<0){
           throw new IndexOutOfBoundsException("Index: " + index + ", Size " + index );
       }else
        return (E) elements[index];
    }
}

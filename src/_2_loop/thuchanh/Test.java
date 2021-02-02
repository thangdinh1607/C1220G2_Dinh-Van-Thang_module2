package _2_loop.thuchanh;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,2,3,4,5,6,6);

        for(int number : list){
            System.out.println(+number);
        }
    }
}

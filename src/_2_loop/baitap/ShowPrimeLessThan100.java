package _2_loop.baitap;

import java.util.Scanner;

public class ShowPrimeLessThan100 {
    public static void main(String[] args) {
        int number=100;
        int count;

        while (number>=2) {
            count=0;
            for(int i=2;i<number;i++){
                if(number%i==0){
                    count++;
                    break;
                }
            }
            if(count==0){
                System.out.println(number);
            }
            number--;
        }
    }
}

package _2_loop.thuchanh;

import java.util.Scanner;

public class InterestRateMoney {
    public static void main(String[]args){
        int money;
        byte month;
        double interest_rate;
        double total_interest=0;
        Scanner scanner=new Scanner(System.in);


        System.out.println("Enter money :");
        money=scanner.nextInt();
        System.out.println("Enter month ");
        month=scanner.nextByte();
        System.out.println("Enter Interest Rate : ");
        interest_rate=((scanner.nextDouble())/100)/12;

        for(byte i=0;i<month;i++){
            total_interest+=money*interest_rate;
        }
        System.out.println(total_interest);


    }
}

package _1_intruction_to_java.bai_tap;

import java.util.Scanner;

public class CoverMoney {
    public static void main(String[] args) {
        double usa;
        double vnd;
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter dollars :");
        usa=scanner.nextDouble();
        if(usa >=0){
            vnd=usa*23000;
            System.out.println("VND --- " +vnd);
        }
    }
}

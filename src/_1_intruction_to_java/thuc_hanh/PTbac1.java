package _1_intruction_to_java.thuc_hanh;

import java.util.Scanner;

public class PTbac1 {
    public static void main(String[] args) {
        double a,b,x;
        Scanner scanner=new Scanner(System.in);

        System.out.println("Nhập a : ");
        a=scanner.nextDouble();
        System.out.println("Nhập b : ");
        b=scanner.nextDouble();

            if(a==0){
                if(b!=0){
                    System.out.println("PT vô nghiệm");
                }else{
                    System.out.println("PT vô số nghiệm");
                }
            }else{
                if(b!=0){
                    x=-b/a;
                    System.out.println("PT có nghiệm là :" + x);
                }
            }
    }
}

package _1_intruction_to_java.thuc_hanh;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        float height,weight,bmi;
        Scanner scanner=new Scanner(System.in);


        System.out.println("Enter height(m) :");
        height=scanner.nextFloat();

        System.out.println("Enter Weight(kg) :");
        weight=scanner.nextFloat();

        bmi=weight/(height*height);

        if(bmi>=30){
            System.out.println("Obese "+ bmi);
        }else if(bmi<30 && bmi>=25){
            System.out.println("Overweight "+ bmi);
        }else if(bmi<25 && bmi >=18.5){
            System.out.println("Normal "+ bmi);
        }else{
            System.out.println("Underweight " + bmi);
        }
    }
}

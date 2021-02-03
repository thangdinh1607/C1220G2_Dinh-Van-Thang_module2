package _3_array_and_method.thuchanh;

import java.util.Scanner;

public class SearchStudent {
    public static void main(String[] args) {
        String[]student={"thang","dinh","aaa","bbb","ccc"};
        String name;
        boolean check=false;
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter Student Name :");
        name=scanner.nextLine();

        for(int i=0;i<student.length;i++) {
            if(student[i].equals(name)){
                System.out.println(student[i] + " index = "+i);
                check=true;
                break;
            }
        }
        if(check==false){
            System.out.println("Can't find it " + name );
        }
    }
}

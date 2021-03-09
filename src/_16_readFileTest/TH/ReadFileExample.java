package _16_readFileTest.TH;

import java.io.*;
import java.util.Scanner;

public class ReadFileExample {
    void readFileExample(String str) throws FileNotFoundException {
        File file = new File(str);
        try {
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = "";
            int sum = 0;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
                sum += Integer.parseInt(line);
            }
            bufferedReader.close();
            System.out.println("Sum" + sum);
        } catch (Exception e) {
            System.out.println("không tìm thấy file");

        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input the link of file");
        String input = scanner.nextLine();

        ReadFileExample readFileExample = new ReadFileExample();
        readFileExample.readFileExample(input);
//        C:\Users\thang\Desktop\a2.txt
//        C:\Users\thang\Desktop\a1.xls
    }
}

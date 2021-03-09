package _16_readFileTest.BT;

import java.io.*;
import java.util.ArrayList;
import java.util.Objects;

public class ReadingCSV {
    static final String File_Path = "C:\\Users\\thang\\Desktop\\a3.txt";


    void ReadCSV() {
        File file = new File(File_Path);
        try {
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            FileReader fileReader = new FileReader(file);
            BufferedReader br = new BufferedReader(fileReader);
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ReadingCSV readingCSV = new ReadingCSV();
        readingCSV.ReadCSV();

    }
}

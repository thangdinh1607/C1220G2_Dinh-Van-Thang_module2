package _16_readFileTest.BT;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class CopyFileTest {
//    public static final String linkFileReader = "C:\\Users\\thang\\Desktop\\a2.txt";
//    public static final String linkFileWrite = "C:\\Users\\thang\\Desktop\\a1.txt";

    void readerFile(String linkRead, String linkWrite) throws FileNotFoundException {
        File fileRead = new File(linkRead);
        File fileWrite = new File(linkWrite);
        FileReader fileReader;
        BufferedReader bufferedReader;
        FileWriter fileWriter;
        BufferedWriter bufferedWriter;
        try {
            fileReader = new FileReader(fileRead);
            bufferedReader = new BufferedReader(fileReader);
            fileWriter = new FileWriter(fileWrite);
            bufferedWriter = new BufferedWriter(fileWriter);
            if (!fileRead.exists()) {
                throw new FileNotFoundException();
            }
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                bufferedWriter.write(line + "\n");
            }
            bufferedReader.close();
            bufferedWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) throws FileNotFoundException {
        CopyFileTest copyFileTest = new CopyFileTest();
        copyFileTest.readerFile("C:\\Users\\thang\\Desktop\\a2.txt", "C:\\Users\\thang\\Desktop\\a1.txt");
    }
}

package _16_readFileTest.BT;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class CopyFileTest {
//    public static final String linkFileReader = "C:\\Users\\thang\\Desktop\\a2.txt";
//    public static final String linkFileWrite = "C:\\Users\\thang\\Desktop\\a1.txt";

    ArrayList<String> readerFile(String linkRead, String linkWrite) throws FileNotFoundException {
        File fileRead = new File(linkRead);
        File fileWrite = new File(linkWrite);
        ArrayList<String> arrayList = new ArrayList<>();

        try {
            FileReader fileReader = new FileReader(fileRead);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            FileWriter fileWriter = new FileWriter(fileWrite);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            if (!fileRead.exists()) {
                throw new FileNotFoundException();
            }
            String line;
            int i = 0;
            while ((line = bufferedReader.readLine()) != null) {
                bufferedWriter.write(line);
            }
            bufferedReader.close();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return arrayList;
    }


    public static void main(String[] args) throws FileNotFoundException {
        CopyFileTest copyFileTest = new CopyFileTest();
        copyFileTest.readerFile("C:\\Users\\thang\\Desktop\\a2.txt", "C:\\Users\\thang\\Desktop\\a1.txt");
    }
}

package _16_readFileTest.BT;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class CopyFileTest {
//    public static final String linkFileReader = "C:\\Users\\thang\\Desktop\\a2.txt";
//    public static final String linkFileWrite = "C:\\Users\\thang\\Desktop\\a1.txt";

    ArrayList<String> readerFile(String link) throws FileNotFoundException {
        File file = new File(link);
        ArrayList<String> arrayList = new ArrayList<>();

        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            String line;
            int i = 0;
            while ((line = bufferedReader.readLine()) != null) {
                arrayList.add(i, line);
                i++;
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return arrayList;
    }

    void writeCVS(List arr, String link) {
        File file = new File(link);
        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
                
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        CopyFileTest copyFileTest = new CopyFileTest();
        copyFileTest.writeCVS(copyFileTest.readerFile("C:\\Users\\thang\\Desktop\\a2.txt"), "C:\\Users\\thang\\Desktop\\a1.txt");
    }
}

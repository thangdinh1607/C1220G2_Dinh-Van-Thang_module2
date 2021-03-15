package Controllers;

import Models.Services;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReaderFile {
    List<String> readerFile(String linkFile) {
        File file = new File(linkFile);
        FileReader fr;
        BufferedReader br = null;
        List<String> arrayList=null;

        try {
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            fr = new FileReader(file);
            br = new BufferedReader(fr);
            String line =null;
             arrayList=new ArrayList<>();
            while ((line = br.readLine()) != null) {
               arrayList.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return arrayList;
    }
}
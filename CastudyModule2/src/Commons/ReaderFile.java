package Commons;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReaderFile {
    public List<String[]> readerFile(String linkFileRead) {
        File file = new File(linkFileRead);
        FileReader fr = null;
        BufferedReader br = null;
        List<String[]> readerList = null;
        String line = null;
        try {
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            fr = new FileReader(file);
            br = new BufferedReader(fr);
            readerList = new ArrayList<>();
            while ((line = br.readLine()) != null) {
                readerList.add(line.split(",")) ;
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
        return  readerList;
    }
}

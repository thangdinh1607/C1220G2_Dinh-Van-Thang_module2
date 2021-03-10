package _17_binaryfile_Serialization.TH;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class CopyFileBinary {
    void copyfile(String linkCopy,String linkOutput) throws IOException {
        FileInputStream fileInputStream=new FileInputStream(linkCopy);
        ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);


    }
}

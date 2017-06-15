package io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * Created by Evegeny on 15/06/2017.
 */
public class MainWriteToFile {
    public static void main(String[] args) throws IOException {
        Client itay = new Client("Itay", 33);
        File file = new File("c:\\temp\\nice\\a.txt");
        if (file.exists()) {
            file.delete();
        }
        file.createNewFile();
        FileOutputStream fos = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(itay);

        oos.close();
    }
}




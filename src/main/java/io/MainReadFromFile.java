package io;

import java.io.*;

/**
 * Created by Evegeny on 15/06/2017.
 */
public class MainReadFromFile {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        File file = new File("c:\\temp\\nice\\a.txt");

        FileInputStream fis = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(fis);
        Object o = ois.readObject();
        System.out.println(o);

        ois.close();
    }
}




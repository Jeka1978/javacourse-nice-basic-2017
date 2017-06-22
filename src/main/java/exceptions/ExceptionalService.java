package exceptions;

import com.sun.imageio.spi.FileImageOutputStreamSpi;

import java.io.*;

/**
 * Created by Evegeny on 22/06/2017.
 */
public class ExceptionalService {
    public void doWork(File file)  {
        if (file.exists()) {
            try {
                FileOutputStream fos = new FileOutputStream(file);
            } catch (FileNotFoundException e) {
                //it will never happen
            }
        }
    }
}

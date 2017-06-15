package wrapper;

import javax.swing.*;
import java.util.Random;

/**
 * Created by Evegeny on 15/06/2017.
 */
public class Main {
    public static void handle(Object o) {
        System.out.println(o);
    }


    public static void main(String[] args) {
      int age = Integer.parseInt(JOptionPane.showInputDialog("input your age"));
        Random random = new Random();
        int i = random.nextInt(100);
    }
}

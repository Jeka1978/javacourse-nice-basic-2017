package inner_classes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Evegeny on 20/06/2017.
 */
public class ColorFrame extends JFrame {
    public ColorFrame(final int[] counter) {
        setSize(400, 400);
        counter[0]*=2;
        JButton button = new JButton("click to change color");
        final JPanel panel = new JPanel();
        getContentPane().add(button, BorderLayout.NORTH);
        getContentPane().add(panel, BorderLayout.CENTER);
        setVisible(true);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel.setBackground(Color.BLUE);
                counter[0]++;
                System.out.println("counter = " + counter[0]);
            }
        });

    }


    public static void main(String[] args) {
        new ColorFrame(new int[]{1});
    }


}

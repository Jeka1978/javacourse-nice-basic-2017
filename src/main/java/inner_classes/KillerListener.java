package inner_classes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Evegeny on 20/06/2017.
 */
public class KillerListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        System.exit(666);
    }
}

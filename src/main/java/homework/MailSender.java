package homework;

/**
 * Created by Evegeny on 22/06/2017.
 */
public class MailSender {
    public void sendMail() {
        int mailCode = DBUtils.getMailCode();
        switch (mailCode) {
            case 1:
                //40 lines of code
                System.out.println("Welcome new client");
                break;
        }
        if (mailCode == 2) {
            //40 lines of code
            System.out.println("Don't call us Nikolas");
        }
    }
}

package homework;

import lombok.SneakyThrows;

/**
 * Created by Evegeny on 22/06/2017.
 */
public class Main {
    @SneakyThrows
    public static void main(String[] args) {
        MailSender mailSender = new MailSender();
        while (true) {
            mailSender.sendMail();
            Thread.sleep(1000);
        }
    }
}

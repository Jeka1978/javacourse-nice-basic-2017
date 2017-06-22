package threads;

import lombok.AllArgsConstructor;
import lombok.SneakyThrows;

/**
 * Created by Evegeny on 22/06/2017.
 */
@AllArgsConstructor
public class ClientService implements Runnable{

    private BankAccount bankAccount;

    @Override
    @SneakyThrows
    public void run() {
        while (true) {
            Thread.sleep(3000);
            System.out.println(bankAccount.getBalance());
        }

    }
}



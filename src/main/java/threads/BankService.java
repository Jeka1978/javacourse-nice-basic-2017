package threads;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.SneakyThrows;

/**
 * Created by Evegeny on 22/06/2017.
 */
@AllArgsConstructor
@Data
public class BankService implements Runnable {
    private BankAccount account;

    @Override
    @SneakyThrows
    public void run() {
        while (true) {
            account.increaseBalance();
            Thread.sleep(1000);
        }
    }
}

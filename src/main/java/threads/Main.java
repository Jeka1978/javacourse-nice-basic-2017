package threads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by Evegeny on 22/06/2017.
 */
public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(100);
        ClientService clientService = new ClientService(bankAccount);
        BankService bankService = new BankService(bankAccount);
        Thread t1 = new Thread(bankService);
        Thread t2 = new Thread(clientService);

        t1.start();
        t2.start();

    }
}

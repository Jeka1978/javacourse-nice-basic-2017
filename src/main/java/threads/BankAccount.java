package threads;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Created by Evegeny on 22/06/2017.
 */
@Data
@AllArgsConstructor
public class BankAccount {
    private int balance;

    public void increaseBalance() {
        balance++;
    }
}

package lombok_builder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Evegeny on 20/06/2017.
 */
public class Main {
    public static void main(String[] args) {

        Customer sivan = Customer.builder().
                age(18).name("Sivan").
                salary(30000)
                .beer("Leff")
                .beer("Shendi")
                .oneFish("Karpion")
                .priority("drama", 0)
                .priority("action", 80)
                .build();
        System.out.println("sivan = " + sivan);
    }
}

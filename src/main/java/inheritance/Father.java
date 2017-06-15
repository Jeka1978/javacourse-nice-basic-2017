package inheritance;

import lombok.Data;

/**
 * Created by Evegeny on 15/06/2017.
 */
@Data
public class Father {
    private int age;

    public Father(int age) {
        this.age = age;
    }
}

package classes;

import lombok.*;

/**
 * Created by Evegeny on 15/06/2017.
 */
@Getter
@ToString(exclude = "age")
@AllArgsConstructor
@NoArgsConstructor
public class User {


    @Setter
    private String name;
    @Setter
    private int age;
    private long id;

}

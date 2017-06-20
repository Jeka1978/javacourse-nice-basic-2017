package enums;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Created by Evegeny on 20/06/2017.
 */
@Data
@AllArgsConstructor
public class Human {
    private String name;
    private MaritalStatus maritalStatus;
}

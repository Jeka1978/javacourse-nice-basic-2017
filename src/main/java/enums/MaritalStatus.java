package enums;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

/**
 * Created by Evegeny on 20/06/2017.
 */
@AllArgsConstructor
@Getter
public enum MaritalStatus {
    SINGLE(1, "רווק"),
    MARRIED(2, "נשוי"),
    DIVORCED(5, "גרוש");

    private final int dbCode;
    private final String hebrewDesc;



}

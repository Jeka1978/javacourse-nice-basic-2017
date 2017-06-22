package enums;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Evegeny on 20/06/2017.
 */

@Getter
public enum MaritalStatus {
    SINGLE(1, "רווק"),
    MARRIED(2, "נשוי"),
    DIVORCED(5, "גרוש");

    public static Map<Integer, MaritalStatus> map = new HashMap<>();

    static {
        MaritalStatus[] values = values();
        for (MaritalStatus value : values) {
            map.put(value.dbCode, value);
        }
    }

    MaritalStatus(int dbCode, String hebrewDesc) {
        this.dbCode = dbCode;
        this.hebrewDesc = hebrewDesc;
    }

    private final int dbCode;
    private final String hebrewDesc;


    public static MaritalStatus findByDbCode(int dbCode) {
        return map.get(dbCode);
    }



}



package enums;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

import java.util.Arrays;

/**
 * Created by Evegeny on 22/06/2017.
 */
@AllArgsConstructor
@Getter
public enum HttpCodeEnum {
    INFO(100, 199, new InfoHttpCodeHandler()),
    SUCCESS(200, 299, new SuccessHttpCodeHandler()),
    ERROR(300, 799, new ErrorHttpCodeHandler());

    private int min;
    private int max;
    private HttpCodeHandler handler;

    public static HttpCodeEnum findByHttpCode(int httpCode) throws RuntimeException {
      /*  Arrays.stream(values())
                .filter(httpCodeEnum -> httpCode<httpCode)
                .findFirst()*/
        for (HttpCodeEnum value : values()) {
            if (value.min <= httpCode && httpCode < value.max){
                return value;
            }
        }
        throw new HttpCodeNotFound(httpCode + " not found");
    }


}

package enums;

import lombok.SneakyThrows;

/**
 * Created by Evegeny on 22/06/2017.
 */
public class HttpService {
    public void handleHttpCode(int code) {
        HttpCodeEnum.findByHttpCode(code).getHandler().handle();
    }
}

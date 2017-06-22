package enums;

import org.junit.Assert;
import org.junit.Test;

import static enums.HttpCodeEnum.SUCCESS;
import static org.junit.Assert.*;

/**
 * Created by Evegeny on 22/06/2017.
 */
public class HttpCodeEnumTest {
    @Test
    public void findByHttpCode() throws Exception {
        HttpCodeEnum httpCodeEnum = HttpCodeEnum.findByHttpCode(254);
        Assert.assertEquals(SUCCESS,httpCodeEnum);
    }

}
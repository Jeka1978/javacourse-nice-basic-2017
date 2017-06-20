package com.nice.data;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

/**
 * Created by Evegeny on 13/06/2017.
 */
public class MyTests {

    private MyService myService;

    @Before
    public void initService(){
        // init code
    }

    @Test
    public void testA() throws Exception {
        double x=1.1;
        double y = 1.3;
        Assert.assertEquals(2.4,x+y,0.00001);
        //test code is here
    }

    @Test
    public void testB() throws Exception {
        //test code is here
    }

    @After
    public void destroyService(){
        // destroy code here
    }
}






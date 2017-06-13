package com.nice.data;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.junit.Assert.*;

/**
 * Created by Evegeny on 13/06/2017.
 */
public class TaxCalculatorTest {
    @Test
    public void withMaam() throws Exception {

        MaamResolver maamResolverMock = Mockito.mock(MaamResolver.class);

        Mockito.when(maamResolverMock.getMaam()).thenReturn(0.1);


        TaxCalculator taxCalculator = new TaxCalculator();
        taxCalculator.setMaamResolver(maamResolverMock);

        double result = taxCalculator.withMaam(100);
        Assert.assertEquals(110,result,0.0001);
    }

}






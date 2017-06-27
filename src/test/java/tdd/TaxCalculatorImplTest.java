package tdd;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

/**
 * Created by Evegeny on 27/06/2017.
 */
public class TaxCalculatorImplTest {
    @Test
    public void withMaam() throws Exception {
        MaamResolver mock = Mockito.mock(MaamResolver.class);
        Mockito.when(mock.getMaam()).thenReturn(0.10);
/*        TaxCalculatorImpl taxCalculator = new TaxCalculatorImpl(mock);
        double withMaam = taxCalculator.withMaam(100);
        Assert.assertEquals(110,withMaam,0.00001);*/



    }

}
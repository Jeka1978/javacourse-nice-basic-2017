package tdd;


/**
 * Created by Evegeny on 27/06/2017.
 */
public class TaxCalculatorImpl implements TaxCalculator {



    @Override
    public double withMaam(double price) {
        double maam = MaamResolver.getInstance().getMaam();
        return maam*price+price;
    }
}

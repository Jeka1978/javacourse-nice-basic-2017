package com.nice.data;

/**
 * Created by Evegeny on 13/06/2017.
 */
public class TaxCalculator {

    public void setMaamResolver(MaamResolver maamResolver) {
        this.maamResolver = maamResolver;
    }

    private MaamResolver maamResolver = new MaamResolverImpl();

    public double withMaam(double price) {
        return maamResolver.getMaam()*price+price;
    }

    public static void main(String[] args) {
        double withMaam = new TaxCalculator().withMaam(100);
        System.out.println("withMaam = " + withMaam);
    }

}

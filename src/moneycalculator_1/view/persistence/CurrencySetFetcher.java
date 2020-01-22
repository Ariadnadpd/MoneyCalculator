package moneycalculator_1.view.persistence;

import moneycalculator_1.model.Currency;
import moneycalculator_1.model.CurrencySet;

public class CurrencySetFetcher implements CurrencySetLoader {

    @Override
    public CurrencySet load() {
        CurrencySet set = new CurrencySet();
        set.add(new Currency("EUR", "Euro", "€"));
        set.add(new Currency("USD", "Dólar americano", "$"));
        set.add(new Currency("HKD", "Dólar Hong Kong", "$"));
        set.add(new Currency("ZWD","Zimbabwe Dollar","Z$"));
        set.add(new Currency("LKR","Sri Lanka Rupee","₨"));
        set.add(new Currency("KPW","Korea (North) Won","₩"));
        set.add(new Currency("JMD","Jamaica Dollar","J$"));
        set.add(new Currency("USD","United States Dollar","$"));
        set.add(new Currency("ALL","Albania Lek","Lek"));
        set.add(new Currency("ARS","Argentina Peso","$"));
        set.add(new Currency("AFN","Afghanistan Afghani","؋"));
        set.add(new Currency("AUD","Australia Dollar","$"));
        set.add(new Currency("CAD","Canada Dollar","$"));
        set.add(new Currency("BMD","Bermuda Dollar","$"));
        set.add(new Currency("YER","Yemen Rial","﷼"));
        set.add(new Currency("TRL","Turkey Lira","₤"));
        set.add(new Currency("THB","Thailand Baht","฿"));
        set.add(new Currency("CUP","Cuba Peso","₱"));
        set.add(new Currency("COP","Colombia Peso","$"));
        set.add(new Currency("BRL","Brazil Real","R$"));
        set.add(new Currency("GIP","Gibraltar Pound","£"));
        set.add(new Currency("FJD","Fiji Dollar","$"));
        set.add(new Currency("HKD","Hong Kong Dollar","$"));
        set.add(new Currency("INR","India Rupee","र"));
        return set;
    }
    
}

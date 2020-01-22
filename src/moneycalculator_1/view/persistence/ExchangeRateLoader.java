package moneycalculator_1.view.persistence;

import moneycalculator_1.model.CurrencySet;
import moneycalculator_1.model.ExchangeRate;
import moneycalculator_1.model.ExchangeRateSet;

public class ExchangeRateLoader {

    public ExchangeRateSet load(CurrencySet c) {
        ExchangeRateSet set = new ExchangeRateSet();
        for (int i = 0; i < c.size(); i++) {
            for (int j = 0; j < c.size(); j++) {
                if (c.get(i).equals(c.get(j))) {
                    set.add(new ExchangeRate(c.get(i), c.get(i), 1));
                } else {
                    set.add(new ExchangeRate(c.get(j), c.get(i), aleatorio(0, 2)));
                }
            }
        }
        return set;
    }

    private float aleatorio(float max, float min) {
        return (float) (Math.random() < 0.5 ? ((1 - Math.random()) * (max - min) + min) : (Math.random() * (max - min) + min));
    }

}

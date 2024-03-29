package moneycalculator_1.model;

public class Exchange {
   
    private final Money money;
    private final Currency currency;

    public Exchange(Money money, Currency currency) {
        this.money = money;
        this.currency = currency;
    }

    public Money getMoney() {
        return money;
    }

    public Currency getCurrency() {
        return currency;
    } 
}

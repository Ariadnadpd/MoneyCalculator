package moneycalculator_1.control;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import moneycalculator_1.model.CurrencySet;
import moneycalculator_1.model.ExchangeRateSet;
import moneycalculator_1.view.persistence.CurrencySetFetcher;
import moneycalculator_1.view.persistence.ExchangeRateLoader;
import moneycalculator_1.view.ui.MainFrame;

public class ExchangeOperation {

    private final CurrencySet currencySet;
    private final ExchangeRateSet rateSet;

    public ExchangeOperation() {
        currencySet = new CurrencySetFetcher().load();
        rateSet = new ExchangeRateLoader().load(currencySet);
    }

    public void execute() {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            MainFrame frmMain = new MainFrame(currencySet.toArray(), rateSet);
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
            MainFrame frmMain = new MainFrame(currencySet.toArray(), rateSet);
        }
    }

}

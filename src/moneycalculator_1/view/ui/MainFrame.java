package moneycalculator_1.view.ui;

import javax.swing.*;
import moneycalculator_1.model.Currency;
import moneycalculator_1.model.ExchangeRateSet;

public class MainFrame extends JFrame {

    private final Currency[] currencies;
    private final ExchangeRateSet rates;

    // Variables declaration 
    private JButton butCalculate;
    private JComboBox comboOutcome;
    private JComboBox comboSource;
    private JPanel panelContents;
    private JPanel panelEquals;
    private JPanel panelOutcome;
    private JPanel panelSource;
    private JTextField txtOutcome;
    private JTextField txtSource;
    private JLabel labelTitle;
    
    public MainFrame(Currency[] currencies, ExchangeRateSet rates) {        
        this.currencies = currencies;
        this.rates = rates;
        initComponents();
        setVisible(true);
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        panelContents = new JPanel();
        panelEquals = new JPanel();
        panelSource = new JPanel();
        txtSource = new JTextField();
        comboSource = new JComboBox();
        panelOutcome = new JPanel();
        txtOutcome = new JTextField();
        comboOutcome = new JComboBox();
        butCalculate = new JButton();
        labelTitle = new JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Money Calculator");
        setResizable(false);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.Y_AXIS));

        panelContents.setBorder(javax.swing.BorderFactory.createEmptyBorder(15, 15, 15, 15));
        panelContents.setLayout(new javax.swing.BoxLayout(panelContents, javax.swing.BoxLayout.Y_AXIS));
        panelContents.add(panelEquals);


        labelTitle.setText("Introduce la cantidad a convertir");
        panelEquals.add(labelTitle);
        
        txtSource.setColumns(15);
        panelSource.add(txtSource, new java.awt.GridBagConstraints());

        comboSource.setModel(new CurrencyComboModel(currencies));
        comboSource.setSelectedIndex(0);
        panelSource.add(comboSource, new java.awt.GridBagConstraints());

        panelContents.add(panelSource);

        panelOutcome.setLayout(new java.awt.GridBagLayout());

        txtOutcome.setEditable(false);
        txtOutcome.setColumns(15);
        panelOutcome.add(txtOutcome, new java.awt.GridBagConstraints());

        comboOutcome.setModel(new CurrencyComboModel(currencies));
        comboOutcome.setSelectedIndex(0);
        panelOutcome.add(comboOutcome, new java.awt.GridBagConstraints());

        panelContents.add(panelOutcome);

        butCalculate.setText("Calculate");
        butCalculate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                butCalculateMouseClicked(evt);
            }
        });
        butCalculate.setAlignmentX(CENTER_ALIGNMENT);
        panelContents.add(butCalculate);

        getContentPane().add(panelContents);

        pack();
    }

    private void butCalculateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butCalculateMouseClicked
        if (!"".equals(txtSource.getText())) {
            convertToSecondAmount();
        }
    }

    

    private void convertToSecondAmount() {
        double firstAmount = Double.parseDouble(txtSource.getText());
        double rate = rates.getRate(currencies[comboSource.getSelectedIndex()],
                currencies[comboOutcome.getSelectedIndex()]);
        txtOutcome.setText(String.valueOf(firstAmount * rate));
    }
}
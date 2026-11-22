package currencyconverter;

import java.util.ArrayList;

public class CurrencyConverterController {
    private CurrencyConverter currencyConverter = new CurrencyConverter();
    public CurrencyConverterController(){

    }
    public double convertCurrency(double amount,Currency source, Currency target){
       double newAmount =  currencyConverter.convert(amount,source,target);
        return newAmount;
    }
    public Currency getCurrency(String abbreviation){
       return currencyConverter.getCurrency(abbreviation);

    }
    public ArrayList<Currency> getCurrencies(){
        return currencyConverter.getCurrencies();
    }
}

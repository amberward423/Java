package currencyconverter.application;
import currencyconverter.dao.CurrencyDao;
import currencyconverter.CurrencyConverter;
import currencyconverter.entity.Currency;

import java.sql.SQLException;
import java.util.ArrayList;

public class CurrencyConverterController {
    private CurrencyConverter currencyConverter = new CurrencyConverter();
    private CurrencyDao currencyDao = new CurrencyDao();
    public CurrencyConverterController(){

    }
    public double convertCurrency(double amount, Currency source, Currency target){
       double newAmount =  currencyConverter.convert(amount,source,target);
        return newAmount;
    }
    public Currency getCurrency(String abbreviation){
        try {
            return currencyDao.getCurrency(abbreviation);
        } catch (SQLException e) {
            return null;
        }

    }


    public ArrayList<Currency> getCurrencies(){
        return currencyConverter.getCurrencies();
    }
}

package currencyconverter;
import currencyconverter.entity.Currency;

import java.util.ArrayList;
public class CurrencyConverter {
    private ArrayList<Currency> currencies = new ArrayList<Currency>();
   public CurrencyConverter(){
       Currency USD = new Currency("USD", "US Dollar", 1.0);
       Currency Euro = new Currency("EUR", "Euro", 0.91175539);
       Currency GBP = new Currency("GBP", "British Pound", 0.76437942);
       currencies.add(USD);
       currencies.add(Euro);
       currencies.add(GBP);
 }

    public ArrayList<Currency> getCurrencies() {
        return currencies;
    }

    public Currency getCurrency (String abbreviation){
         for(int i = 0; i < currencies.size(); i ++){
                 if (currencies.get(i).getAbbreviation() != null && currencies.get(i).getAbbreviation().equals(abbreviation)) {
                     return currencies.get(i);
                 }
             }
             return null;
            }
            public double convert(double amount, Currency from, Currency to ) {
            double fromRate = from.getExchangeRate();
            double newRate = amount * fromRate;
            double toRate = to.getExchangeRate();
            double convertedAmount = newRate/toRate;
            return convertedAmount;
            }

        }



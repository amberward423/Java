package currencyconverter;

public class Currency {
  private String abbreviation;
  private String name;
  private double exchangeRate;
    public Currency(String abbreviation, String name, double exchangeRate){
        this.abbreviation = abbreviation;
        this.name = name;
        this.exchangeRate = exchangeRate;

    }

    public String getAbbreviation(){
        return abbreviation;
    }

    public String getName(){
        return name;
    }

    public double getExchangeRate(){
        return exchangeRate;
    }

    public void setAbbreviation(String abbreviation){
        this.abbreviation = abbreviation;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setExchangeRate(double exchangeRate){
        this.exchangeRate = exchangeRate;
    }

    @Override
   public String toString(){
        return getAbbreviation() + "-" + getName();
    }
}

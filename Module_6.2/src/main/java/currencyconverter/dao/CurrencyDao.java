package currencyconverter.dao;
import java.sql.Connection;
import currencyconverter.datasource.MariaDbConnection;
import currencyconverter.entity.Currency;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CurrencyDao {
  public Currency getCurrency(String abbreviation) throws SQLException {
      String sql = "SELECT rate,name,abbreviation FROM currency WHERE abbreviation = ?";
      try (Connection connection = MariaDbConnection.getConnection(); PreparedStatement ps = connection.prepareStatement(sql)) {
          ps.setString(1, abbreviation);
          try (ResultSet rs = ps.executeQuery()){
              if (rs.next() == true) {
                  Currency currency = new Currency(rs.getString("abbreviation"), rs.getString("name"),rs.getDouble("rate"));
                  return currency;
              }
              throw new SQLException("Currency abbreviation not found");
          }
      }
      public ArrayList<Currency> getAllCurrencies(){
          String sql = "SELECT rate,name,abbreviation FROM currency";

      }
  }
}

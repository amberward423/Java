package currencyconverter.datasource;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MariaDbConnection {
    private static Connection connection = null;

    public static Connection getConnection(){
        if(connection == null){
            try{
                connection = DriverManager.getConnection(
                        "jdbc:mariadb://localhost:3306/currency_converter?user=appuser&password=password");
            } catch (SQLException e) {
                System.out.println("Connection failed.");
                e.printStackTrace();
            }
            return connection;
        }
        else {
            return connection;
        }
    }

    public static void terminate() {
        if (connection != null) {
            try {
                getConnection().close();
                connection = null;
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}



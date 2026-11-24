package currencyconverter.application;
import currencyconverter.CurrencyConverterView;
import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception {
        CurrencyConverterView currencyConverterView = new CurrencyConverterView(primaryStage);
    }
    public static void main(String[] args){
        launch(args);
    }
}

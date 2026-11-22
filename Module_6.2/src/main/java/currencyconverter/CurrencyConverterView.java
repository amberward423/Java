
package currencyconverter;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.geometry.Pos;

public class CurrencyConverterView {
    private TextField amountField;
    private Button convertButton;
    private Label convertedamount;
    private Label title;
    private Label instruct1;
    private Label instruct2;
    private Label instruct3;
    private ComboBox<Currency> sourceCurrency;
    private ComboBox<Currency> targetCurrency;
    private CurrencyConverterController controller;

    public CurrencyConverterView(Stage stage) {
        amountField = new TextField();
        convertButton = new Button("convert");
        convertedamount = new Label();
        title = new Label();
        instruct1 = new Label();
        instruct2 = new Label();
        instruct3 = new Label();
        controller = new CurrencyConverterController();
        title.setText("Currency Converter");
        instruct1.setText("1.) Enter the amount you want to convert.");
        instruct2.setText("2.) Select the currency you're converting from and the currency you're converting to.");
        instruct3.setText("3.) Click Convert to display the result.");

        sourceCurrency = new ComboBox<>();
        sourceCurrency.getItems().addAll(controller.getCurrencies());

        targetCurrency = new ComboBox<>();
        targetCurrency.getItems().addAll(controller.getCurrencies());

        VBox root = new VBox();
        root.getChildren().add(title);
        root.getChildren().add(instruct1);
        root.getChildren().add(instruct2);
        root.getChildren().add(instruct3);
        root.getChildren().add(amountField);
        root.getChildren().add(sourceCurrency);
        root.getChildren().add(targetCurrency);
        root.getChildren().add(convertButton);
        root.getChildren().add(convertedamount);

        convertButton.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                double amount;

                if (amountField.getText().isBlank()) {
                    convertedamount.setText("Please enter an amount");
                    return;
                }

                try {
                    amount = Double.parseDouble(amountField.getText());
                } catch (NumberFormatException e) {
                    convertedamount.setText("Please enter a number");
                    return;
                }

                Currency source = sourceCurrency.getValue();
                Currency target = targetCurrency.getValue();

                double meaning = controller.convertCurrency(amount, source, target);
                convertedamount.setText(String.valueOf(meaning));
            }
        });

        Scene scene = new Scene(root);
        scene.getStylesheets().add("style.css");
        stage.setScene(scene);
        stage.show();
    }
}

package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML private TextField purpchasePriceTextField;           // input:
    @FXML private TextField downPaymentsTextField;             // input:
    @FXML private TextField interestRatePercentageTextField;   // input:
    @FXML private TextField monthlyPaymentCustomTextField;     // output:
    @FXML private TextField monthlyPayment10YearsTextField;    // output:
    @FXML private TextField monthlyPayment20YearsTextField;    // output:
    @FXML private TextField monthlyPayments30YearsTextField;   // output:
    @FXML private TextField loanAmountTextField;
    @FXML private Slider yearsSlider;
    @FXML private Text yearsText;

    private double years;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        yearsSlider.valueProperty().addListener(
                (observable, oldValue, newValue) -> {
                    years = newValue.doubleValue();
                    yearsText.setText(String.format("Year(s): %.2f ", years));
        }  );
        years = 1;   // This prevents us from getting zero division errors!

    }


    public void calulateButtonPressed(ActionEvent event){
        try{
            // Use String.format(" to convert doubles/int's to text ... ");
            // Use the parse function ... to convert strings to doubles,
            // The reason why is because TextFields ONLY accept Strings!!!

            String purchasePriceTextFieldString = purpchasePriceTextField.getText();
            String downPaymentTextFieldString = downPaymentsTextField.getText();
            String interestRatePercentageTextFieldString = interestRatePercentageTextField.getText();

            double purchasePrice = Double.parseDouble(purchasePriceTextFieldString);
            double downPayment = Double.parseDouble(downPaymentTextFieldString);
            double interestRate = Double.parseDouble(interestRatePercentageTextFieldString)/100;

            if(downPayment < 0 || purchasePrice < 0 || interestRate < 0){
                // Exception with negative inputs:
                monthlyPaymentCustomTextField.setText("N/A negative value Exception");
                loanAmountTextField.setText("N/A negative value Exception");
                monthlyPayment10YearsTextField.setText("N/A negative value Exception");
                monthlyPayment20YearsTextField.setText("N/A negative value Exception");
                monthlyPayments30YearsTextField.setText("N/A negative value Exception");

            } else if(downPayment > purchasePrice){
                // Exception Handling to avoid negative Monthly mortgage payment values!
                monthlyPaymentCustomTextField.setText("Down Payment is Higher than Purchase Price!");
                loanAmountTextField.setText("There is no need to take a loan! ");
                monthlyPayment10YearsTextField.setText("Down Payment is Higher than Purchase Price!");
                monthlyPayment20YearsTextField.setText("Down Payment is Higher than Purchase Price!");
                monthlyPayments30YearsTextField.setText("Down Payment is Higher than Purchase Price!");

            }else{
                double loanAmountValue = retreiveLoanAmount(purchasePrice, downPayment);
                double customMonthlyPayment = retriveMonthlyPayment(purchasePrice, interestRate, downPayment, years);
                double monthlyPayment10Years = retriveMonthlyPayment(purchasePrice, interestRate, downPayment, 10);
                double monthlyPayment20Years = retriveMonthlyPayment(purchasePrice, interestRate, downPayment, 20);
                double monthlyPayment30Years = retriveMonthlyPayment(purchasePrice, interestRate, downPayment, 30);


                loanAmountTextField.setText(String.format("$ %.2f", loanAmountValue));                        // output:
                monthlyPaymentCustomTextField.setText(String.format("$ %.2f", customMonthlyPayment));         // output:
                monthlyPayment10YearsTextField.setText(String.format("$ %.2f", monthlyPayment10Years));       // output:
                monthlyPayment20YearsTextField.setText(String.format("$ %.2f", monthlyPayment20Years));       // output:
                monthlyPayments30YearsTextField.setText(String.format("$ %.2f", monthlyPayment30Years));      // output:
            }
        }
        catch (NumberFormatException ex) {
            purpchasePriceTextField.setText("Enter Amount");
            purpchasePriceTextField.selectAll();
            purpchasePriceTextField.requestFocus();

            downPaymentsTextField.setText("Enter Amount");
            downPaymentsTextField.selectAll();
            downPaymentsTextField.requestFocus();

            interestRatePercentageTextField.setText("Enter Amount");
            interestRatePercentageTextField.selectAll();
            interestRatePercentageTextField.requestFocus();

        }

    }


    private double retreiveLoanAmount(double purchasePrice, double downPayment){
        return purchasePrice - downPayment;
    }

    private double retriveMonthlyPayment(double purchasePrice, double interestRate, double downPayment, double years){

        if(interestRate == 0){
            return (purchasePrice - downPayment)/(12*years);
        }

        double compoundInterestMultiplier = compoundInterestFactor(interestRate, years); // we assume interestRate is a fraction ...
        double compoundInterest = retreiveLoanAmount(purchasePrice, downPayment) * compoundInterestMultiplier;

        return compoundInterest * (  (interestRate/12)  / (compoundInterestMultiplier -1) );

        // Mortgage Calculator Formula: [ (P - D ) * (i/12) ] / [ (i/12)/()  ]
    }


    private double compoundInterestFactor(double interestRate, double years){
        return Math.pow( (1 + interestRate/12), (12*years) );
    }



}



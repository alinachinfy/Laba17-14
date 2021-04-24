package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class Controller {
    @FXML
    Label labelA;
    @FXML
    Label labelB;
    @FXML
    Label labelSum;
    @FXML
    Button buttonCalc;
    @FXML
    Button buttonClear;
    @FXML
    TextField textA;
    @FXML
    TextField textB;
    @FXML
    TextField textSum;

    @FXML
    private void clickButtonCalc(ActionEvent event) {
        double a = Double.parseDouble(textA.getText());
        double b = Double.parseDouble(textB.getText());
        textSum.setText(Double.toString(a+b));
    }

    @FXML
    void clickButtonClear(ActionEvent event) {
        textA.setText("");
        textB.setText("");
        textSum.setText("");
    }
}

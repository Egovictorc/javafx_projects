package info.devrealm.javafxcalculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import org.w3c.dom.events.MouseEvent;

public class MainController {
    @FXML
    private Label result, expression;


    @FXML
    protected void onActionEvent(ActionEvent event) {
        Button btn = (Button)event.getSource();
        String btnText = btn.getText();

        switch(btnText) {
            case "1" , "2", "3", "4", "5", "6", "7", "8", "9" -> {
                handleNumber(btnText);
            }

        }
    }

    private void handleOperator() {

    }
    private void handleNumber(String num) {
        String previousVal = expression.getText();
        expression.setText(previousVal + num);
    }


}
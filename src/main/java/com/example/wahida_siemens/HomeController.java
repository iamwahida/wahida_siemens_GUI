package com.example.wahida_siemens;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HomeController {

    @FXML
    private TextField input;

    @FXML
    private Label output;

    @FXML
    protected void reverseBtnClick() {
        String str = input.getText();

        if (str.isEmpty()) {
            output.setText("Die Eingabe ist leer. Du kannst es nochmal versuchen :)");
        } else {
            StringBuilder reverseStr = new StringBuilder(str);
            String reversed_text = reverseStr.reverse().toString();

            output.setText("\n" + reversed_text);
        }
    }
}

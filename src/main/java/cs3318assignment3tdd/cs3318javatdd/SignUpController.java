package cs3318assignment3tdd.cs3318javatdd;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class SignUpController {
    @FXML
    private PasswordField userPassword;
    @FXML
    private TextField userEmailAddress;
    @FXML
    private Label messageField;
    @FXML
    private Button signUpButton;

    private String email;
    private String password;

    @FXML
    private void submit(ActionEvent event) {
        email = userEmailAddress.getText();
        password = userPassword.getText();
    }

}
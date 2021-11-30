package cs3318assignment3tdd.cs3318javatdd;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class WelcomeController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}
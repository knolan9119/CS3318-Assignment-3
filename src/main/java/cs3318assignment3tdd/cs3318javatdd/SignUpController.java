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

    private EmailAddress validEmailAddress;
    private Password validPassword;
    private User newUser;

    private UserList listOfUsers = new UserList();

    @FXML
    private void submit(ActionEvent event) {
        email = userEmailAddress.getText();
        password = userPassword.getText();
        try{
            validEmailAddress = new EmailAddress(email);
            validPassword = new Password(password);
            newUser = new User(validEmailAddress,validPassword);
            listOfUsers.addUser(newUser);
            messageField.setText("Thank You for Signing Up!");
        }
        catch(IllegalArgumentException e) {
            messageField.setText("Please enter a valid email address and password.");
        }
        catch(DuplicateUserException e) {
            messageField.setText("A user is already registered with this email address.");
        }
        catch(Exception e) {
            messageField.setText("An error has occurred: "+e);

        }

    }

    public String getEnteredEmail() {
        return this.email;
    }

    public String getEnteredPassword() {
        return this.password;
    }

}
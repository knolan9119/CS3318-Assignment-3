package cs3318assignment3tdd.cs3318javatdd;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Password {
    private String password;

    public Password(String password) {
        this.validatePassword(password);
        this.password = password;
    }

    public String getPassword() {
        return this.password;
    }

    private boolean isBlank(String password){
        if(password==null){
            return true;
        }
        return (password.length() < 1);
    }

    private boolean containsAtLeastOneLetter(String password) {
        Pattern pattern = Pattern.compile("^(?=.*[A-Za-z]).+$");
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }

    private boolean containsAtLeastOneDigit(String password) {
        Pattern pattern = Pattern.compile("^(?=.*\\d).+$");
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }

    private boolean containsAtLeastOneSpecialCharacter(String password){
        Pattern pattern = Pattern.compile("^(?=.*[*^&@!]).+$");
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }

    private void validatePassword(String password){
        if(this.isBlank(password)){
            throw new IllegalArgumentException("Password cannot be null or empty");
        }

        if(password.length()<7) {
            throw new IllegalArgumentException("Password must be at least 7 characters in length");
        }

        if(!this.containsAtLeastOneLetter(password)) {
            throw new IllegalArgumentException("Password must contain at least one letter");
        }

        if(!this.containsAtLeastOneDigit(password)) {
            throw new IllegalArgumentException("Password must contain at least one digit");
        }

        if(!this.containsAtLeastOneSpecialCharacter(password)) {
            throw new IllegalArgumentException("Password must contain at least one character from: *^&@!.");
        }

    }
}

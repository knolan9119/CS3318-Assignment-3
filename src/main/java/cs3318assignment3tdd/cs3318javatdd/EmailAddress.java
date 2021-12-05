package cs3318assignment3tdd.cs3318javatdd;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailAddress {
    private String email;

    public EmailAddress(final String email) {

        this.validateEmailAddress(email);
        this.email = email;

    }

    public String getEmailAddress() {
        return this.email;
    }

    private boolean isBlank(String email){
        if(email == null) {
            return true;
        }
        return (email.length() < 1);

    }

    /**
     * Checks if the provided email is well-formed based on RFC 5322.
     * @param email
     * @return boolean
     */
    private boolean isWellFormed(String email){
        Pattern pattern = Pattern.compile("^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$");
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();

    }

    private void validateEmailAddress(String email) {
        if(this.isBlank(email)) {
            throw new IllegalArgumentException("Email address cannot be null or empty");
        }
        if(!isWellFormed(email)){
            throw new IllegalArgumentException("Email address is not well formed.");
        }

    }
}

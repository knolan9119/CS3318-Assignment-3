package cs3318assignment3tdd.cs3318javatdd;

public class User {
    private EmailAddress emailAddress;
    private Password password;

    public User(final EmailAddress emailAddress, final Password password) {
            this.emailAddress = emailAddress;
            this.password = password;
    }

    public String getPasswordAsString() {
        return this.password.getPassword();
    }

    public String getEmailAddressAsString() {
        return this.emailAddress.getEmailAddress();
    }

    public void setPassword(Password password) {
        this.password = password;
    }

    public void setEmailAddress(EmailAddress emailAddress) {
        this.emailAddress = emailAddress;
    }

    @Override
    public String toString() {
        return "email address: "+this.getEmailAddressAsString()+"\npassword: "+this.getPasswordAsString();
    }

    public boolean hasSameEmailAddress(User other){
        return this.getEmailAddressAsString().equals(other.getEmailAddressAsString());
    }
}

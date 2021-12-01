package cs3318assignment3tdd.cs3318javatdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    private User user;

    @BeforeEach
    public void setUp() {
        EmailAddress emailAddress = new EmailAddress("test123@test.ie");
        Password password = new Password("abc123!");
        user = new User(emailAddress, password);
    }

    @Test
    void getPasswordAsAStringShouldReturnNonNullPassword() {
        assertTrue(user.getPasswordAsString().length()>0);
    }

    @Test
    void getEmailAddressAsStringShouldReturnNonNullEmailAddress() {
        assertTrue(user.getEmailAddressAsString().length()>0);
    }

    @Test
    void shouldAllowToSetNewPassword() {
        Password newPassword = new Password("password1!");
        user.setPassword(newPassword);
        assertEquals(user.getPasswordAsString(), newPassword.getPassword());
    }

    @Test
    void shouldAllowToSetNewEmailAddress() {
        EmailAddress newEmailAddress = new EmailAddress("newemail@test.com");
        user.setEmailAddress(newEmailAddress);
        assertEquals(user.getEmailAddressAsString(),newEmailAddress.getEmailAddress());
    }
}
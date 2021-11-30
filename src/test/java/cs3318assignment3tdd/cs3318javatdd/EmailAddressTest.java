package cs3318assignment3tdd.cs3318javatdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;

class EmailAddressTest {

    @Test
    public void shouldCreateValidEmailAddress() {
        EmailAddress EmailAddress = new EmailAddress("abc@gmail.com");
        Assertions.assertTrue(EmailAddress.getEmailAddress().length()>0);
    }

    @Test
    public void shouldThrowIllegalArgumentExceptionForNotWellFormedEmail() {
        Executable testConstructor = () -> new EmailAddress("not-valid@gmail.@com");
        assertThrows(IllegalArgumentException.class,testConstructor,"Email address is not well formed.");
    }

    @Test
    public void shouldThrowIllegalArgumentExceptionForNullEmailAddress() {
        Executable testConstructor = () -> new EmailAddress(null);
        assertThrows(IllegalArgumentException.class,testConstructor,"Email address cannot be null or empty");
    }

    @Test
    public void shouldThrowIllegalArgumentExceptionForEmptyEmailAddress() {
        Executable testConstructor = () -> new EmailAddress("");
        assertThrows(IllegalArgumentException.class,testConstructor,"Email address cannot be null or empty");
    }




}
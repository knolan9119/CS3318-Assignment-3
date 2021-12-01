package cs3318assignment3tdd.cs3318javatdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;


class PasswordTest {

    @Test
    public void shouldCreateValidPassword() {
        Password password = new Password("12345a!");
    }

    @Test
    public void shouldThrowIllegalArgumentExceptionForLengthLessThanSeven() {
        Executable testConstructor = () -> new Password("1234!a");
        assertThrows(IllegalArgumentException.class,testConstructor,"Password must be at least 7 characters in length");

    }

    @Test
    public void shouldThrowIllegalArgumentExceptionForNotContainingALetter() {
        Executable testConstructor = () -> new Password("123456!");
        assertThrows(IllegalArgumentException.class,testConstructor,"Password must contain at least one letter");
    }

    @Test
    public void shouldThrowIllegalArgumentExceptionForNotContainingAtDigit() {
        Executable testConstructor = () -> new Password("abcdefg!");
        assertThrows(IllegalArgumentException.class,testConstructor,"Password must contain at least one digit");
    }

    @Test
    public void shouldThrowIllegalArgumentExceptionForNotContainingASpecialCharacter() {
        Executable testConstructor = () -> new Password("123456a");
        assertThrows(IllegalArgumentException.class,testConstructor,"Password must contain at least one character from: *^&@!.");
    }

}
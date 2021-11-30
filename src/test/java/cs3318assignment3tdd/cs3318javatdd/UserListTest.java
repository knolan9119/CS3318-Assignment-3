package cs3318assignment3tdd.cs3318javatdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;

class UserListTest {

    private User user1;
    UserList userList;

    @BeforeEach
    public void setUp() {
        Password password1 = new Password("password1!");
        EmailAddress emailAddress1 = new EmailAddress("emailAddress1@gmail.com");
        user1 = new User(emailAddress1,password1);
        userList = new UserList();
    }

    @Test
    public void shouldAllowToAddToUserList() {
        userList.addUser(user1);
        assertEquals(1, userList.getListOfUsers().size());
    }

    @Test
    public void shouldAllowMultipleUsers() {
        userList.addUser(user1);
        Password password2 = new Password("password2!");
        EmailAddress emailAddress2 = new EmailAddress("emailAddress2@gmail.com");
        User user2 = new User(emailAddress2,password2);
        userList.addUser(user2);
        assertEquals(userList.getListOfUsers().size(),2);
    }

    @Test
    public void shouldNotAllowMoreThanOneUserPerEmailAddress() {
        userList.addUser(user1);
        Password password2 = new Password("password1!");
        EmailAddress emailAddress2 = new EmailAddress("emailAddress1@gmail.com");
        User user2 = new User(emailAddress2,password2);
        Executable multipleOfTheSameUser  = () -> userList.addUser(user2);
        assertThrows(DuplicateUserException.class,multipleOfTheSameUser,"User already registered with this email address");
    }
}
package cs3318assignment3tdd.cs3318javatdd;

/**
 * Exception used by UserList when a user is attempting to be added to the list but a user with that email address
 * already exists.
 */
public class DuplicateUserException extends RuntimeException {
    public DuplicateUserException(String errorMessage, Throwable err) {
        super(errorMessage,err);
    }
}
